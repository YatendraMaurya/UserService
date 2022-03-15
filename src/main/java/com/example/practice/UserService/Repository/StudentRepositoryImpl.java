package com.example.practice.UserService.Repository;

import com.example.practice.UserService.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    List<User> users = new ArrayList<>();
    @Override
    public Optional<User> getUser(int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public User addUser(User user) {
        users.add(user);
        return user;
    }


}
