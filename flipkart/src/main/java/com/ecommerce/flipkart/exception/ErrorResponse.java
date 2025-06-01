package com.ecommerce.flipkart.exception;

import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@AllArgsConstructor
public class ErrorResponse {
    private String message;
    private LocalDateTime timestamp;
}