package com.springboot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController

public class HelloworldController {
	
	
	//GET HTTP method
	//http://localhost:8080/hello-world
	@GetMapping("/hello-world")
	public String helloworld() {
		return "Hello world";
	}
	

}
