package com.saurabh.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public  class AuthenticationService{
	
	public boolean Authenticate (String username, String password) {
         boolean isvalidusername = username.equalsIgnoreCase("ABC");
         boolean isvalidpassword = password.equalsIgnoreCase("pass");
         
         return isvalidusername && isvalidpassword ;
	}

}
