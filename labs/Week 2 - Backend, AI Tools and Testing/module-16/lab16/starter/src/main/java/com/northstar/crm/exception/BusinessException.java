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

    // TODO: static notFound(customerId, correlationId) → CUSTOMER_NOT_FOUND / 404
    // TODO: static conflict(message, correlationId) → BUSINESS_CONFLICT / 409
}
