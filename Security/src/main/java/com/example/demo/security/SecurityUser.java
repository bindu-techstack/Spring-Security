package com.example.demo.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.entities.User;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SecurityUser implements UserDetails{

	
	private  final User user;

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getUsername();
	}
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return user.getAuthorities().stream().map(a -> (GrantedAuthority) () -> a)
                .toList();
	}

}
