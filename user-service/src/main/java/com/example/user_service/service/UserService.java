package com.example.user_service.service;

import java.util.List;

import com.example.user_service.entity.user;

public interface UserService {

    public user getUserbyId(Long id);

    public user addUser(user _user);

    public void deleteUserbyId(Long id);

    public List<user> getAllUsers();

    //public void borrowbook(Long id);

}
