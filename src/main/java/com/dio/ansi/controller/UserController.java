package com.dio.ansi.controller;

import com.dio.ansi.model.User;
import com.dio.ansi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @DeleteMapping("/{idUser}")
    public void deleteUser(Long idUser) {
        userService.deleteUserById(idUser);
    }

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{idUser}")
    public User findById(@PathVariable("idUser") Long idUser) {
        return userService.findById(idUser);
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
}
