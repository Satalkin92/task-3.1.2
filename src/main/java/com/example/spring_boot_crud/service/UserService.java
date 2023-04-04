package com.example.spring_boot_crud.service;

import com.example.spring_boot_crud.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void updateUser(Long id, User user);

    void deleteUser(Long id);

    User getUser(Long id);
    List<User> getUsers();

}
