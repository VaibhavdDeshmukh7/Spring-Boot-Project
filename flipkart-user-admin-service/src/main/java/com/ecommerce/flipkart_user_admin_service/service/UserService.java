package com.ecommerce.flipkart_user_admin_service.service;

import com.ecommerce.flipkart_user_admin_service.dao.UserRepository;
import com.ecommerce.flipkart_user_admin_service.pojo.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public String addUser(User user) {
        userRepository.save(user);
        return "User added successfully";
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

    public String deleteUser(long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return "User deleted successfully";
        } else {
            throw new RuntimeException("User not found with id: " + id);
        }
    }
}
