package com.example.spring.controllers;

import com.example.spring.dto.UserDTO;
import com.example.spring.entities.User;
import com.example.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Iterator;
import java.util.List;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    List<UserDTO> getAllUsers() {
        return userService.getUsers();
    }
}
