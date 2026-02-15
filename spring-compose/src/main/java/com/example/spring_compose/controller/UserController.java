package com.example.spring_compose.controller;

import com.example.spring_compose.entity.User;
import com.example.spring_compose.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<User> list() {
        return repository.findAll();
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return repository.save(user);
    }
}
