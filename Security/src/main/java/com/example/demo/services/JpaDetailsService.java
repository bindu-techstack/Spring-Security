package com.example.demo.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;
import com.example.demo.security.SecurityUser;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JpaDetailsService implements UserDetailsService{
	
	private final UserRepository userRepository ;

	@Override
	public UserDetails loadUserByUsername(String username)  {
		
		var u = userRepository.findUserByUsername(username);
		return u.map(SecurityUser::new).orElseThrow(() -> new UsernameNotFoundException("Username not found" + username));
		
	}
}
