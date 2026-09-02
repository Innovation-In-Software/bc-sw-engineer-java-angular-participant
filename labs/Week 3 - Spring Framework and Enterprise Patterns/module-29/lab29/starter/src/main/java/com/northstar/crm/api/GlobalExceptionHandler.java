package com.northstar.crm.api;

import com.northstar.crm.dto.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<ErrorResponse> handleValidation(MethodArgumentNotValidException ex, WebRequest request) {
    // TODO: build ErrorResponse status 400 with field violations; include correlation if present
    throw new UnsupportedOperationException("TODO: validation → 400 ErrorResponse");
  }

  @ExceptionHandler(IllegalArgumentException.class)
  public ResponseEntity<ErrorResponse> handleNotFound(IllegalArgumentException ex, WebRequest request) {
    // TODO: 404 envelope for "Customer not found" (CUS-9999 path)
    throw new UnsupportedOperationException("TODO: not-found → 404 ErrorResponse");
  }

  @ExceptionHandler(IllegalStateException.class)
  public ResponseEntity<ErrorResponse> handleConflict(IllegalStateException ex, WebRequest request) {
    // TODO: 409 for duplicate customer
    throw new UnsupportedOperationException("TODO: duplicate → 409 ErrorResponse");
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<ErrorResponse> handleSafe500(Exception ex, WebRequest request) {
    // TODO: 500 without leaking stack traces / SQL
    throw new UnsupportedOperationException("TODO: safe 500 ErrorResponse");
  }
}
