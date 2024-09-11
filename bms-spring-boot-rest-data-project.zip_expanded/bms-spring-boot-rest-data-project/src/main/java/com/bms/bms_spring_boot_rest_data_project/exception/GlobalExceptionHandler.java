package com.bms.bms_spring_boot_rest_data_project.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

  // here write all the exception handler methods

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<Map<String, List<String>>> notValid(MethodArgumentNotValidException ex, HttpServletRequest request) {
    List<String> errors = new ArrayList<>();
    ex.getAllErrors().forEach(err -> errors.add(err.getDefaultMessage()));
    Map<String, List<String>> result = new HashMap<>();
    result.put("errors", errors);
    return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
  }  
}