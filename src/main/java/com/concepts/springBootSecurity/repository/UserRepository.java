package com.concepts.springBootSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.concepts.springBootSecurity.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByEmail(String email);
}
