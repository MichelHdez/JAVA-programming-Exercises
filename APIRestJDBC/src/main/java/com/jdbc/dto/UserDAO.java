package com.jdbc.dto;

import com.jdbc.models.User;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface UserDAO {
    ResponseEntity<User> createUser(User user);
    public User getUserById(int id);
    public void updateUser(User user);
    public void deleteUser(int id);
    public List<User> getAllUsers();
}
