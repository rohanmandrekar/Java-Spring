package com.springboot.myfirstwebapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;



@Controller
@SessionAttributes("name")
public class WelcomeController {
	
	

	@RequestMapping(value="/",method=RequestMethod.GET )
	public String gotoWelcomePage(ModelMap model) {
		model.put("name", getLoggedinUsername());
		return "welcome";
		
	}
	
	private String getLoggedinUsername() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name=auth.getName();
		name=name.substring(0, 1).toUpperCase() + name.substring(1);
		return name;
	}
	
}
