package com.example.demo.entities;

import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection="authorities")
public class Authority {
	
	private String name;
	private String description;

}
