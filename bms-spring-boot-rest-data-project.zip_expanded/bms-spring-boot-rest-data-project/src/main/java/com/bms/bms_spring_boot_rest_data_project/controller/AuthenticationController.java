package com.bms.bms_spring_boot_rest_data_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bms_spring_boot_rest_data_project.config.JwtService;
import com.bms.bms_spring_boot_rest_data_project.dao.entity.UserInfoEntity;

@RestController
@RequestMapping("/api")
public class AuthenticationController {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private JwtService jwtService;

	@PostMapping("/validate")
	public String validate(@RequestBody UserInfoEntity userInfo) {
		System.out.println("in validate");
		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(userInfo.getName(), userInfo.getPassword()));
		if (authentication.isAuthenticated()) {
			return jwtService.generateToken(userInfo.getName());
		} else {
			throw new UsernameNotFoundException("invalid user request !");
		}
	}
}
