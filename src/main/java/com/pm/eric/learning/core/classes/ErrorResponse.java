package com.pm.eric.learning.core.classes;

import lombok.Data;
import org.springframework.http.HttpStatusCode;

@Data
public class ErrorResponse {
    private int statusCode;
    private Object message;
}
