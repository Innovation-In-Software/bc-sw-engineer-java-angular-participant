package com.northstar.crm.exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GlobalExceptionHandlerTest {
    GlobalExceptionHandler handler = new GlobalExceptionHandler();

    @Test
    void mapsNotFoundTo404() {
        ErrorResponse r = handler.fromBusiness(BusinessException.notFound("CUS-9999", "lab-request-001"));
        assertEquals(404, r.getStatus());
        assertEquals("CUSTOMER_NOT_FOUND", r.getError());
        assertEquals("lab-request-001", r.getCorrelationId());
    }

    @Test
    void mapsConflictTo409() {
        ErrorResponse r = handler.fromBusiness(BusinessException.conflict("x", "lab-request-001"));
        assertEquals(409, r.getStatus());
    }
}
