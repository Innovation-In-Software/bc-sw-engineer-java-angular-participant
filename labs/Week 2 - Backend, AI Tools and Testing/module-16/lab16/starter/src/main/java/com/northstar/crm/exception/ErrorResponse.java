package com.northstar.crm.exception;

import java.time.Instant;
import java.util.Map;

public class ErrorResponse {
    // TODO: fields timestamp, status, error, message, correlationId, errors (always present, maybe empty)
    // TODO: constructor + getters
    // TODO: toJson() that always includes errors:{}

    public String toJson() {
        throw new UnsupportedOperationException("TODO: toJson");
    }
}
