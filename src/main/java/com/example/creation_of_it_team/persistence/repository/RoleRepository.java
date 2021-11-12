package com.example.creation_of_it_team.persistence.repository;

import com.example.creation_of_it_team.persistence.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByName(String name);
}
