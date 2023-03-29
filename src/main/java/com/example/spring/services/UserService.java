package com.example.spring.services;

import com.example.spring.dto.UserDTO;
import com.example.spring.entities.User;
import com.example.spring.mappers.UserMapper;
import com.example.spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserService {
    private UserRepository repo;

    @Autowired
    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public void updateUser(Long id) {
        User user = repo.getUserById(id);

    }

    public List<UserDTO> getUsers() {
        List<User> users = repo.findAll();
        List<UserDTO> usersDTO = new ArrayList<>();
        for (User user : users) {
            usersDTO.add(UserMapper.INSTANCE.userToUserDTO(user));
        }

        return usersDTO;
    }
}
