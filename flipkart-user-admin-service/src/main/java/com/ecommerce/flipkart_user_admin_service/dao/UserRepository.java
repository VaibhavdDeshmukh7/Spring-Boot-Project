package com.ecommerce.flipkart_user_admin_service.dao;

import com.ecommerce.flipkart_user_admin_service.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
