package com.ecommerce.flipkart_user_admin_service.exception;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class ErrorResponse {
    private String message;
    private LocalDateTime timestamp;
}
