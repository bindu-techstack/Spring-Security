package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.entities.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	Optional<User> findUserByUsername(String username);

}
