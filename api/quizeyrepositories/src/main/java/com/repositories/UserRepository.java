package com.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.models.User;

public interface UserRepository extends MongoRepository<User, Long> {

	public User getUserByUserName(String userName);
}
