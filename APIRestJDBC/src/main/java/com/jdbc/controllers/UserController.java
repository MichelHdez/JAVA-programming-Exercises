package com.jdbc.controllers;

import com.jdbc.dto.UserDAO;
import com.jdbc.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserDAO userDAO;

    @GetMapping
    public List<User> getUsers() {
        return userDAO.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        User user = userDAO.getUserById(id);
        if (user == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
        }
        return user;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        try {
            return userDAO.createUser(user);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PutMapping("/{id}")
    public void updateUser(@RequestBody User user, @PathVariable int id) {
        User userActual = userDAO.getUserById(id);
        if (userActual == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
        }
        userDAO.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody void deleteUser(@PathVariable int id) {
       User user = userDAO.getUserById(id);
       if (user == null) {
           throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
       }
       userDAO.deleteUser(id);
    }

}
