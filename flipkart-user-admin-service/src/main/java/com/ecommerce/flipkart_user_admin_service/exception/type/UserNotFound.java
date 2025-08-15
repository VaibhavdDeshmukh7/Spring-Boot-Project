package com.ecommerce.flipkart_user_admin_service.exception.type;

public class UserNotFound extends RuntimeException{
    public UserNotFound(String message) {
        super(message);
    }
}
