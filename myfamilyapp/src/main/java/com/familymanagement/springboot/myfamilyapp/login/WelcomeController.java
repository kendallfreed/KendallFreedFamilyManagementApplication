package com.familymanagement.springboot.myfamilyapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

	// logger shows it in the console logs
	// http://localhost:8081/login?name=Ranga
	// RequestParam takes query parameter ?name = Name where name is a String
	@RequestMapping(value = "/", method = RequestMethod.GET) // when this url is hit, the function runs
	public String gotoWelcomePage(ModelMap model) {
		model.put("name", getLoggedInUsername());
		return "welcome";
	}
	
	private String getLoggedInUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}

}
