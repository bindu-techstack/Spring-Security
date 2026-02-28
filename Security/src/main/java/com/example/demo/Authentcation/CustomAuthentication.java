package com.example.demo.Authentcation;

import java.util.Collection;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class CustomAuthentication implements Authentication {
	
	private boolean authentication;
	
    private String key;
    

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return List.of();
	}

	@Override
	public @Nullable Object getCredentials() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public @Nullable Object getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public @Nullable Object getPrincipal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAuthenticated() {
		// TODO Auto-generated method stub
		//System.out.println(isAuthenticated);
		return authentication;
		
	}
        
	@Override
	public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		this.authentication= isAuthenticated;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
