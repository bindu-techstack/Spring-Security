package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.AuthRequest;

@RestController
public class AuthController {
	
	@PostMapping("/authenticate")
	public String login(@RequestBody AuthRequest authRequest) {
		return "jwt token";
	}

}
