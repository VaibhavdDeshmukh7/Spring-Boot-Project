package com.ecommerce.flipkart_user_admin_service.controller;


import com.ecommerce.flipkart_user_admin_service.dto.UserDTO;
import com.ecommerce.flipkart_user_admin_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    public ResponseEntity<?> getUser(@RequestParam UserDTO userDTO) {
        return ResponseEntity.ok(userService.getUserById(userDTO.getId()));
    }
}
