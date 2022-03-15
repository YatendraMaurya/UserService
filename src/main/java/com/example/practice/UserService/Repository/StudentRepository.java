package com.example.practice.UserService.Repository;

import com.example.practice.UserService.Model.User;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
    Optional<User> getUser(int id);
    List<User> getUsers();
    User addUser(User user);
}
