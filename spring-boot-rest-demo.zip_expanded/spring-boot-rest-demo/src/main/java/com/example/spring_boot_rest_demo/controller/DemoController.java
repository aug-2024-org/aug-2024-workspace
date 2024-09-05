package com.example.spring_boot_rest_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

	// GET http://localhost:8080/api/hello
	@GetMapping("/hello")
	public String hello() {
		return "Hello everyone!!";
	}
}
