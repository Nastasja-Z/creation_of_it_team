package com.example.creation_of_it_team.persistence.repository;

import com.example.creation_of_it_team.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String userName);
}
