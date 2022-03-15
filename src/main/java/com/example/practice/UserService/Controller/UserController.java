package com.example.practice.UserService.Controller;

import com.example.practice.UserService.Model.User;
import com.example.practice.UserService.Service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/users")
public class UserController {

    StudentService studentService;

    @GetMapping
    public ResponseEntity getUsers() {
        return ResponseEntity.status(200).body(studentService.getUsers());
    }

    @GetMapping("/{userId}")
    public ResponseEntity getUser(@PathVariable("userId") int id) {
        User user = studentService.getUser(id);
        if (user != null) {
            return ResponseEntity.status(200).body(user);
        }
        return ResponseEntity.status(404).body("User Not Found");
    }

    @PostMapping
    public ResponseEntity addUser(@RequestBody User user){
        return ResponseEntity.status(202).body(studentService.addUser(user));
    }

}
