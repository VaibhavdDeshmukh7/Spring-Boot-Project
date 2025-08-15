package com.ecommerce.flipkart_user_admin_service.controller;


import com.ecommerce.flipkart_user_admin_service.dto.UserDTO;
import com.ecommerce.flipkart_user_admin_service.pojo.User;
import com.ecommerce.flipkart_user_admin_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public ResponseEntity<?> getUser(@RequestParam UserDTO userDTO) {
        return ResponseEntity.ok(userService.getUserById(userDTO.getId()));
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getUsers());
    }

    @PostMapping("/addUser")
    public ResponseEntity.BodyBuilder addUser(@RequestBody UserDTO userDTO) {
        User user = new User(userDTO.getName(), userDTO.getContact());
        return ResponseEntity.created(userService.addUser(user));
    }

    @DeleteMapping("/deleteUser")
    public ResponseEntity<String> deleteUser(@RequestParam UserDTO userDTO) {
        return ResponseEntity.ok(userService.deleteUser(userDTO.getId()));
    }
}
