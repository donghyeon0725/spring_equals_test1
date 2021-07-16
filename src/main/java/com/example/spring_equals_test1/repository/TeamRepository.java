package com.example.spring_equals_test1.repository;

import com.example.spring_equals_test1.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
    Team findByTitle(String title);
}
