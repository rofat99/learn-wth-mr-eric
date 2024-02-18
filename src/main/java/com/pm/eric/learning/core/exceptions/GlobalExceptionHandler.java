package com.pm.eric.learning.core.exceptions;

import com.pm.eric.learning.core.classes.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationException(MethodArgumentNotValidException ex) {
        List<FieldError> objList = ex.getBindingResult().getFieldErrors();
        List<String> errorMessages = new ArrayList<>();
        for(FieldError obj : objList ){
            errorMessages.add(obj.getDefaultMessage());
        }
        ErrorResponse object = new ErrorResponse();
        object.setStatusCode(ex.getStatusCode().value());
        object.setMessage(errorMessages);
        return ResponseEntity.badRequest().body(object);
    }
}
