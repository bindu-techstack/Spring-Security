package com.example.demo.AuthenticationManager;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import com.example.demo.Authentcation.CustomAuthentication;
import com.example.demo.providers.CustomAuthenticationProvider;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class CustomAuthenticationManager implements AuthenticationManager{

	
	private final CustomAuthenticationProvider customAuthentication;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		if(customAuthentication.supports(authentication.getClass())) {
			System.out.println("in custom authentication");
			return customAuthentication.authenticate(authentication);
		}
		
		throw new BadCredentialsException("Oh No!");
	}
	

}
