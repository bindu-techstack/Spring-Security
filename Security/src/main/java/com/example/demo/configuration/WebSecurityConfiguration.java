//package com.example.demo.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//
//@Configuration
//public class WebSecurityConfiguration {
//	
//	@Bean
//	public UserDetailsService userdetails() {
//		
//		var uds = new InMemoryUserDetailsManager();
//		
//		var u1 = User.withUsername("Bindu")
//				.password("1234")
//				.authorities("read")
//				.build();
//		
//		uds.createUser(u1);
//		
//		return uds;
//	
//		
//	}
//	
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}
//
//}
