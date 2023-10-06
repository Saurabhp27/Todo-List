package com.saurabh.springboot.myfirstwebapp.login;

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
// renamed from logincontroller to welcomecontroller


	@RequestMapping(value="/",method = RequestMethod.GET)
	public String gotoWelcomePage (ModelMap model) {
		model.put("name", getLoggedinUsername());
		return "welcome";
	}
	
	private String getLoggedinUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private AuthenticationService  authenticateservice;
//	
//	public LoginController(AuthenticationService authenticateservice) {
//		super();
//		this.authenticateservice = authenticateservice;
//	}

//	@RequestMapping(value ="login",method = RequestMethod.POST)
//	public String gotowelcomePage (@RequestParam String name, @RequestParam String password, ModelMap model) {
//		if(authenticateservice.Authenticate(name, password)) { 
//		model.put("name", name);
//		model.put("password", password);
//		return "welcome";
//		}
//		model.put("Errormsg", "Invalid username or password" );
//		return "login"; 
//		
//	}
    ///  USED ABOVE CODE EARLIER TO LOGIN  AND AUTHENTICATE USER WITH HARD CODED VALUE 	
    // HENCE NOW AUTHENTICATESERVICE CLASS AND LOGIN.JSP IS OF NO USE , WE WILL BE
	//	USING SPRINGBOOT SECURITY TO DO THE TASKS
}
