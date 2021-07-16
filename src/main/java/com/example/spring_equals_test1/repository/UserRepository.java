package com.example.spring_equals_test1.repository;

import com.example.spring_equals_test1.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
