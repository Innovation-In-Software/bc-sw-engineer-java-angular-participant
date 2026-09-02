package com.northstar.crm.exception;

import jakarta.validation.ConstraintViolation;
import java.util.Set;

public class GlobalExceptionHandler {

    public ErrorResponse fromBusiness(BusinessException ex) {
        // TODO: map statusHint / code / message / correlationId; errors = empty map
        throw new UnsupportedOperationException("TODO: fromBusiness");
    }

    public ErrorResponse fromValidation(
            Set<? extends ConstraintViolation<?>> violations, String correlationId) {
        // TODO: status 400 VALIDATION_FAILED with field → message map
        throw new UnsupportedOperationException("TODO: fromValidation");
    }

    public ErrorResponse fromUnexpected(Exception ex, String correlationId) {
        // TODO: status 500 INTERNAL_ERROR generic message (no stack / no ex.getMessage leak)
        throw new UnsupportedOperationException("TODO: fromUnexpected");
    }
}
