package com.example.demo.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Basic {
	
	@GetMapping("/hello")
	public String hello() {
		System.out.println("hello world");
		var  u = SecurityContextHolder.getContext().getAuthentication();
		u.getAuthorities().forEach(a -> System.out.println(u));
		return "hello";
	}

}
