package com.demo.spring_boot_mvc_collection_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class DemoController {

	// http://localhost:9595/api/home
	@GetMapping("/home")
	public String getHomePage() {
		// this method returns view name
		return "homePage";
	}
}
