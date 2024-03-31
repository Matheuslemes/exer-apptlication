package com.msllemes.exerapplication.repository;

import com.msllemes.exerapplication.entities.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface UserRepository extends MongoRepository<UserProfile, UUID> {

}
