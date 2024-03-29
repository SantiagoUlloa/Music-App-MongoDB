package com.example.Musicapp.service;

import com.example.Musicapp.model.User;

import java.util.List;

public interface UserService {

    public User createUser(User newUser);

    public User findUserByEmail(String email);

    public List<User> listUsers();

}