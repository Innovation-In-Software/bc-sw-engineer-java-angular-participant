package com.northstar.crm.exception;

import jakarta.validation.ConstraintViolation;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class GlobalExceptionHandler {

    public ErrorResponse fromBusiness(BusinessException ex) {
        return new ErrorResponse(
                ex.getStatusHint(), ex.getCode(), ex.getMessage(),
                ex.getCorrelationId(), Map.of());
    }

    public ErrorResponse fromValidation(
            Set<? extends ConstraintViolation<?>> violations, String correlationId) {
        Map<String, String> fields = new LinkedHashMap<>();
        for (ConstraintViolation<?> v : violations) {
            fields.put(v.getPropertyPath().toString(), v.getMessage());
        }
        return new ErrorResponse(400, "VALIDATION_FAILED", "Validation failed", correlationId, fields);
    }

    public ErrorResponse fromUnexpected(Exception ex, String correlationId) {
        return new ErrorResponse(500, "INTERNAL_ERROR", "Unexpected server error", correlationId, Map.of());
    }
}
