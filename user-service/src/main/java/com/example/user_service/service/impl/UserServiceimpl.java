package com.example.user_service.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user_service.entity.user;
import com.example.user_service.repository.UserRepository;
import com.example.user_service.service.UserService;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public user getUserbyId(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public List<user> getAllUsers()
    {
        return userRepository.findAll();
    }

    public user addUser(user _user)
    {
        return userRepository.save(_user);
    }

    public void deleteUserbyId(Long id)
    {
        userRepository.deleteById(id);
    }

    // public void borrowBook(Long id)
    // {
    //     user _user = getUserbyId(id);
    //     _user.
    // }
}
