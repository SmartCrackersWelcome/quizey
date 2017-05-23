package com.config;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import com.Response;
import com.google.gson.Gson;

/**
 * This the Base Filter for every request
 * 
 * @author RITESH SINGH
 *
 */
@WebFilter("/*")
public class BaseFilter implements Filter {

	private ServletContext context;

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	public void init(FilterConfig filterConfig) throws ServletException {
		
		this.context = filterConfig.getServletContext();
		this.context.log("RequestLoggingFilter initialized");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest,
	 * javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		Enumeration<String> params = request.getParameterNames();
		while (params.hasMoreElements()) {
			String name = params.nextElement();
			String value = request.getParameter(name);
			this.context.log(request.getRemoteAddr() + "::Request Params::{" + name + "=" + value + "}");
		}

		String token = req.getHeader("token");
		try {
			if (!isIgnoreUrlForAuth(request)) {
				if (token.equals("RITESH9984")) {
					writeBadCredantialToResponse(response);
					return;
				}
			}
		} catch (Exception e) {
			writeErrorToResponse(e, response);
			return;
		}

		chain.doFilter(request, response);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#destroy()
	 */
	public void destroy() {
		System.out.println("Base-Filter Destroy.");
	}

	/**
	 * This method used when exception occurs in doFilter
	 * 
	 * @param e
	 * @param servletResponse
	 * @throws IOException
	 */
	private void writeErrorToResponse(Exception e, ServletResponse servletResponse) throws IOException {
		Response response = new Response();
		response.setStatus(500);
		response.setStatusDescription(e.getMessage());
		try (PrintWriter writer = servletResponse.getWriter()) {
			writer.write(new Gson().toJson(response));
			writer.flush();
		}

	}

	/**
	 * If token expired then this method will generate response
	 * 
	 * @param servletResponse
	 * @throws IOException
	 */
	private void writeBadCredantialToResponse(ServletResponse servletResponse) throws IOException {
		Response response = new Response();
		response.setStatus(302);
		response.setStatusDescription("Token has been expired.");
		try (PrintWriter writer = servletResponse.getWriter()) {
			writer.write(new Gson().toJson(response));
			writer.flush();
		}
	}

	/**
	 * @param request
	 * @return true if requestedUrl matched from ignoreUrl List
	 */
	private boolean isIgnoreUrlForAuth(ServletRequest request) {

		/**
		 * This class validate the requestedUrl from ignoreUrl List to avoid
		 * authentication
		 * 
		 * @author RITESH SINGH
		 */
		class RequestUrl {

			/**
			 * @return requestedAppUrl without http://yourhost:port/appname
			 */
			private String getRequestedUrl() {
				HttpServletRequest req = (HttpServletRequest) request;
				String appName = request.getServletContext().getContextPath();
				String requestedCompleteUrl = req.getRequestURL().toString();
				int i = requestedCompleteUrl.indexOf(appName) + appName.length();
				String requestedAppUrl = requestedCompleteUrl.substring(i);
				return requestedAppUrl;
			}

			/**
			 * @return true if requestedAppUrl matched in ignoreUrl list
			 */
			protected boolean getIgnoreStatus() {
				if (IgnoreAuthUrls.URLS.contains(getRequestedUrl()))
					return true;
				else
					return false;
			}
		}
		return new RequestUrl().getIgnoreStatus();
	}
}