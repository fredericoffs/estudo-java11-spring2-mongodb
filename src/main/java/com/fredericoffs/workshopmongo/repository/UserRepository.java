package com.fredericoffs.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fredericoffs.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
