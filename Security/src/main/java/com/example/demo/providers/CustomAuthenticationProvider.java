package com.example.demo.providers;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import com.example.demo.Authentcation.CustomAuthentication;

import lombok.AllArgsConstructor;


@Component
public class CustomAuthenticationProvider implements AuthenticationProvider{

	@Value("${first.very.secret.key}")
	private String key;
	
	@Override
	public @Nullable Authentication authenticate(Authentication authentication) throws AuthenticationException {
		CustomAuthentication ca = (CustomAuthentication) authentication;
		
		String headerKey = ca.getKey();
		System.out.println(headerKey);
		
		if(key.equals(headerKey)) {
			return new CustomAuthentication(true, key);
		}
		
		throw new BadCredentialsException("oh no!");
		
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		System.out.println("support class");
		return CustomAuthentication.class.equals(authentication);
	}

}
