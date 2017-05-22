package com.config;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/*")
public class BaseFilter implements Filter{
	
	private ServletContext context;

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Base-Filter Initialization");
		this.context = filterConfig.getServletContext();
		this.context.log("RequestLoggingFilter initialized");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String appName = request.getServletContext().getContextPath();
		
		Enumeration<String> params = request.getParameterNames();
		while(params.hasMoreElements()){
			String name = params.nextElement();
			String value = request.getParameter(name);
			this.context.log(request.getRemoteAddr() + "::Request Params::{"+name+"="+value+"}");
		}

		System.out.println("Base-Filter Start");
        System.out.println(request.getProtocol()+" : "+request.getLocalAddr());
        System.out.println("Base-Filter Stop"); 
        
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        
       // if(true){
        	
        	String url = "http://" + request.getLocalAddr()+":"+request.getLocalPort() + appName+"/employee/get-employee";
        	
        	/*HttpServletResponse resp = (HttpServletResponse) response;
            resp.reset();
            resp.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
            resp.setHeader("Location", url);
            response = resp;*/
            
            /*httpResponse.sendRedirect(appName+"/employee/get-employee");
	        return;*/
        //}
        System.out.println(request.getLocalAddr());
        System.out.println(request.getLocalPort());
        System.out.println(request.getProtocol());
        
        //  pass the request along the filter chain
        chain.doFilter(request,response);	
	}

	public void destroy() {
		System.out.println("Base-Filter Destroy.");
	}
}