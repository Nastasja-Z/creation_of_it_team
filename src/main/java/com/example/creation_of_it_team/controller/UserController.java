package com.example.creation_of_it_team.controller;

import com.example.creation_of_it_team.persistence.entity.User;
import com.example.creation_of_it_team.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // remake in registration and security
    @PostMapping("/new")
    public String createUser(@ModelAttribute("user") User user) {
        userService.create(user);
        return "redirect:/users";
    }
}