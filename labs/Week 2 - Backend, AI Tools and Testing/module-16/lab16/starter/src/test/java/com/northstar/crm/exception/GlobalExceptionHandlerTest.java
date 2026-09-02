package com.northstar.crm.exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GlobalExceptionHandlerTest {
    GlobalExceptionHandler handler = new GlobalExceptionHandler();

    @Test
    void mapsNotFoundTo404() {
        // TODO: fromBusiness(BusinessException.notFound(...)) → status 404, code CUSTOMER_NOT_FOUND
        throw new UnsupportedOperationException("TODO: 404 mapping");
    }

    @Test
    void mapsConflictTo409() {
        // TODO: fromBusiness(BusinessException.conflict(...)) → status 409
        throw new UnsupportedOperationException("TODO: 409 mapping");
    }

    @Test
    void unexpectedIsGeneric500() {
        // TODO: fromUnexpected → 500 INTERNAL_ERROR; message must not contain secret/stack text
        throw new UnsupportedOperationException("TODO: 500 mapping");
    }
}
