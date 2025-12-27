package com.ordermanagement.userservice.controller;

import com.ordermanagement.userservice.entity.User;
import com.ordermanagement.userservice.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{
    public final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user)
    {
       return userService.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers()
    {
       return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id)
    {
       return userService.getUserById(id);

    }


}
