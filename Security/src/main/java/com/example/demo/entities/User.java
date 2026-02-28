package com.example.demo.entities;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection="users")
public class User {
	
	@Id
	private String id;
	
	private String username;

    private String password;
	
	private Set<String> authorities;
	
	

}
