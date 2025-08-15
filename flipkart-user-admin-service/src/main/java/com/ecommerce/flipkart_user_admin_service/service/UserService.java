package com.ecommerce.flipkart_user_admin_service.service;

import com.ecommerce.flipkart_user_admin_service.dao.UserRepository;
import com.ecommerce.flipkart_user_admin_service.exception.type.UserNotFound;
import com.ecommerce.flipkart_user_admin_service.pojo.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(int id) {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFound("User not found with id: " + id));
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public URI addUser(User user) {
        userRepository.save(user);
        return URI.create("/user/" + user.getId());
    }

    @Transactional
    public String updateUser(User user) {
        if (userRepository.existsById(user.getId())) {
            userRepository.save(user);
            return "User updated successfully";
        } else {
            throw new RuntimeException("User not found with id: " + user.getId());
        }
    }

    public String deleteUser(int id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return "User deleted successfully";
        } else {
            throw new RuntimeException("User not found with id: " + id);
        }
    }
}
