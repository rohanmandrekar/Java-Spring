package com.springboot.myfirstwebapp.login;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class LoginController {
//	private Logger logger= LoggerFactory.getLogger(getClass());
	@RequestMapping("login")
	public String gotoLoginPage(@RequestParam String name, ModelMap model) {
		//System.out.println("Request param is "+ name);
//		logger.debug("Request Param is {}",name);
//		logger.info("Request Param printed at info level is {}",name);
//		logger.warn("Request Param printed at warn level  is {}",name);
//		System.out.println(name);
//		model.put("name", name);
		return "login";
		
	}

}
