package com.saurabh.springboot.myfirstwebapp.hello;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	// http://localhost:8080/say-hello
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayhello() {
		return "Hello, How are you doing?";
	}
	
	
	
	
	@RequestMapping("say-hello-jsp")
//	@ResponseBody  -- not returnig the body but returning the .jsp
	public String sayhellojsp(ModelMap model) {
		
		model.put("name", "Ram");   // can use this in jsp (string key, obj) @Requestparam can be passsed which can be used as object 
		return "sayHello";  // prefix and suffix added in property 
	}
}
