package com.example.creation_of_it_team.service;

import com.example.creation_of_it_team.persistence.entity.User;

public interface UserService extends BaseService<User>  {

    public User findByUsername(String username);
}
