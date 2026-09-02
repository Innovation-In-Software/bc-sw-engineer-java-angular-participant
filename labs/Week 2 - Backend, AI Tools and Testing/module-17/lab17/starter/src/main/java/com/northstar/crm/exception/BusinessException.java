package com.northstar.crm.exception;

public class BusinessException extends RuntimeException {
    private final String code;
    private final int statusHint;
    private final String correlationId;

    public BusinessException(String code, String message, int statusHint, String correlationId) {
        super(message);
        this.code = code;
        this.statusHint = statusHint;
        this.correlationId = correlationId;
    }

    public String getCode() { return code; }
    public int getStatusHint() { return statusHint; }
    public String getCorrelationId() { return correlationId; }

    public static BusinessException notFound(String customerId, String correlationId) {
        return new BusinessException(
                "CUSTOMER_NOT_FOUND",
                "Customer not found: " + customerId,
                404,
                correlationId);
    }

    public static BusinessException conflict(String message, String correlationId) {
        return new BusinessException("BUSINESS_CONFLICT", message, 409, correlationId);
    }
}
