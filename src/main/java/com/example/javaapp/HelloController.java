package com.example.javaapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

	    
@RestController
public class HelloController {
	@Value("${my.name}")
	private String myName;

	@GetMapping("/")
	public String index() {
		return myName;
	}

}
