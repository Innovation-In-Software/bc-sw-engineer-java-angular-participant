package com.northstar.crm.api;

import com.northstar.crm.service.UnknownCustomerException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

  public record ApiError(String error, String correlationId) {}

  @ExceptionHandler(UnknownCustomerException.class)
  public ResponseEntity<ApiError> notFound(UnknownCustomerException ex) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND)
        .body(new ApiError("not-found", "lab-request-001"));
  }
}
