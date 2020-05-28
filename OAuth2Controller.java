package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class OAuth2Controller {

	@GetMapping("/")  //no restriction
	public String hello()
	{
		return "Hello";
	}
	@GetMapping("/restricted") //restrict access
	public String restrict()
	{
		return "log in to see the contents";
	}
}
