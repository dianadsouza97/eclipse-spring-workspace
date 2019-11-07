package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class EmployeeErrorHandler {
	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> handleEmployeeNotFoundException(EmployeeNotFoundException enfe){
		EmployeeErrorResponse error=new EmployeeErrorResponse(HttpStatus.NOT_FOUND.value(),enfe.getMessage(),System.currentTimeMillis());
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
public ResponseEntity<EmployeeErrorResponse> handleCustomerNotFoundException(Exception e) {

		
		
		EmployeeErrorResponse error=new EmployeeErrorResponse(HttpStatus.NOT_FOUND.value(),e.getMessage(), System.currentTimeMillis());
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
}
