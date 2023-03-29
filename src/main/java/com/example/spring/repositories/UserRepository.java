package com.example.spring.repositories;

import com.example.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Iterator;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll();

    User getUserById(Long id);

    User getUserByEmail(String email);
}
