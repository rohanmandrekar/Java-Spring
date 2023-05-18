package com.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	//   /say-hello -> "Learning springboot today"
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! We are learning Spring Boot 3 today!";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb= new StringBuffer();
		
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My first Spring HTML page </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>Hello! We are learning Spring Boot 3 today!</h1>");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
		
	}

}
