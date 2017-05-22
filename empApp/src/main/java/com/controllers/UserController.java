package com.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

@Controller
@RequestMapping(value = "users")
public class UserController {
	
	@RequestMapping(value = { "/template" }, method = RequestMethod.GET)
	public ModelAndView form() throws IOException {
		
		Map<String, Object> data = new HashMap<String, Object>();
		
		return new ModelAndView("user/newuser", "data", data);
	}
	
	@RequestMapping(value = { "/launchUser" }, method = RequestMethod.GET)
	public ModelAndView formlaunchUser() throws IOException {
		
		Map<String, Object> data = new HashMap<String, Object>();
		
		return new ModelAndView("user/new", "data", data);
	}
	
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public @ResponseBody String formSave(@RequestBody User user) throws IOException {
		
		List<User> users = new ArrayList<User>();
		users.add(user);
		return new Gson().toJson(users);
	}
}
