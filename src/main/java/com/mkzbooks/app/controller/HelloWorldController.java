package com.mkzbooks.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value="/")
	public String hello() {
		return "Hello Giovanni Spring Boot!";
	}
}
