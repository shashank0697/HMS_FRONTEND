package com.microservices.login.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservices.login.model.ERole;
import com.microservices.login.model.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}

