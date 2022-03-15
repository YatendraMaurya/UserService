package com.example.practice.UserService.Service;

import com.example.practice.UserService.Model.User;

import java.util.List;

public interface StudentService {
    User getUser(int id);
    List<User> getUsers();
    User addUser(User user);
}
