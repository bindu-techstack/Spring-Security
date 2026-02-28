package com.example.demo.security;

import java.util.Collection;

import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.entities.Authority;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority{
	
	private final Authority authority;

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return authority.getName();
	}
	
	

}
