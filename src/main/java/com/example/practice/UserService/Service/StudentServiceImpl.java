package com.example.practice.UserService.Service;

import com.example.practice.UserService.Model.User;
import com.example.practice.UserService.Repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    @Override
    public User getUser(int id) {
        Optional<User> user = studentRepository.getUser(id);
        if (user.isPresent())
            return user.get();
        return null;
    }

    @Override
    public List<User> getUsers() {
        return studentRepository.getUsers();
    }

    @Override
    public User addUser(User user) {
        return studentRepository.addUser(user);
    }

}
