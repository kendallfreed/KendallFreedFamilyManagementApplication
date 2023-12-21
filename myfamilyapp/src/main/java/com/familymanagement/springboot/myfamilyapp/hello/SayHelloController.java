package com.familymanagement.springboot.myfamilyapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //S pring handles this and handles web requests, so need controller annotation
public class SayHelloController {
	//http://localhost:8080/say-hello
	@RequestMapping("say-hello") // when this url is hit, the function runs
	@ResponseBody // return whatever is returned by message as is to browser
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
/*
 <dependency>
	<groupId>org.apache.tomcat.embed</groupId>
	<artifactId>tomcat-embed-jasper</artifactId>
	<scope>provided</scope>
</dependency>
*/
	
	
	@RequestMapping("say-hello-html") // when this url is hit, the function runs
	@ResponseBody // return whatever is returned by message as is to browser
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My First HTML Page </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first html page with body");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	// JSP - Java Service Pages, way better than method above
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("say-hello-jsp") // when this url is hit, the function runs
	public String sayHelloJsp() {
		return "sayHello";
	}
}
