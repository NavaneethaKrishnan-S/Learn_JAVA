package com.naveen.springboot.myFirstWebApp.loginExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
		
	//http://localhost:8080/login?name=Naveen
	@RequestMapping("login")
	public String showLogin(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		logger.debug("Request param is {}", name);
		logger.info("I want this printed at info level");
		return "login";
	}
}
