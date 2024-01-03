package com.security.springsecurity.repository;

import com.security.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByName(String username);
}
