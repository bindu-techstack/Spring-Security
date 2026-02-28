package com.example.demo.AuthenticatonFilter;

import java.io.IOException;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.demo.Authentcation.CustomAuthentication;
import com.example.demo.AuthenticationManager.CustomAuthenticationManager;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;


@Component
@AllArgsConstructor
public class CustomAuthenticationFilter extends OncePerRequestFilter {
	
	private final CustomAuthenticationManager customAuthenticationManager;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String key = String.valueOf(request.getHeader("key"));
		System.out.println(key);
		CustomAuthentication ca = new CustomAuthentication(false,key);
		System.out.println("in custom Authentication filter");
		var a = customAuthenticationManager.authenticate(ca);
		System.out.println("successful authentication"+a);
		if(a.isAuthenticated()) {
			System.out.println("boolean vale" + a.isAuthenticated());
			SecurityContextHolder.getContext().setAuthentication(a);
		
		filterChain.doFilter(request, response);
		}
	}
	
	

}
