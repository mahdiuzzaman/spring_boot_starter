package com.mahdi.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController  
// this annotation is combination of  @Controller and @ResponseBody
public class HelloController {
	
	// in this annotation default is always http Get method
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
}
