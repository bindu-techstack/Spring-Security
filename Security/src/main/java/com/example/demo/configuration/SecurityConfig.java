package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.demo.AuthenticatonFilter.CustomAuthenticationFilter;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class SecurityConfig  {
	
	
	private final CustomAuthenticationFilter customAuthentication;
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		System.out.println("in security config class");
		return http.httpBasic(Customizer.withDefaults())
				//.addFilterAt(customAuthentication, UsernamePasswordAuthenticationFilter.class)
			     //.authorizeHttpRequests(auth -> auth.requestMatchers("/hello").authenticated())
			     .authorizeHttpRequests(auth ->auth.requestMatchers("/authenticate").permitAll().anyRequest().authenticated())
			     .build();
	}
}
