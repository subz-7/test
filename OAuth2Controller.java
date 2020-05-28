package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Rest Controller
public class OAuth2Controller {

	@GetMapping("/")
	public String hello()
	{
		return "Hello";
	}
	@GetMapping("/restricted")
	public String restrict()
	{
		return "log in to see the contents";
	}
}
