package com.springboot.myfirstwebapp.login;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class LoginController {
	
	
	private AuthenticationService authenticationservice;
	
	public LoginController(AuthenticationService authenticationservice) {
		super();
		this.authenticationservice = authenticationservice;
	}

	@RequestMapping(value="login",method=RequestMethod.GET )
	public String gotoLoginPage() {

		return "login";
		
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model ) {
		
		if (authenticationservice.authenticate(name, password)) {
		model.put("name",name);
		return "welcome";
		} 
		
		model.put("errorMessage", "Invalid Credentials");
		return "login";
	}

}
