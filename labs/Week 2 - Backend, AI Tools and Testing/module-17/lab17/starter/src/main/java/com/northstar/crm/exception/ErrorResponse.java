package com.northstar.crm.exception;

import java.time.Instant;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ErrorResponse {
    private final Instant timestamp;
    private final int status;
    private final String error;
    private final String message;
    private final String correlationId;
    private final Map<String, String> errors;

    public ErrorResponse(int status, String error, String message, String correlationId,
                         Map<String, String> errors) {
        this.timestamp = Instant.now();
        this.status = status;
        this.error = error;
        this.message = message;
        this.correlationId = correlationId;
        this.errors = errors == null
                ? Map.of()
                : Collections.unmodifiableMap(new LinkedHashMap<>(errors));
    }

    public Instant getTimestamp() { return timestamp; }
    public int getStatus() { return status; }
    public String getError() { return error; }
    public String getMessage() { return message; }
    public String getCorrelationId() { return correlationId; }
    public Map<String, String> getErrors() { return errors; }

    public String toJson() {
        String errFields = errors.entrySet().stream()
                .map(e -> "\"" + e.getKey() + "\":\"" + escape(e.getValue()) + "\"")
                .collect(Collectors.joining(","));
        return "{"
                + "\"timestamp\":\"" + timestamp + "\","
                + "\"status\":" + status + ","
                + "\"error\":\"" + escape(error) + "\","
                + "\"message\":\"" + escape(message) + "\","
                + "\"correlationId\":\"" + escape(correlationId) + "\","
                + "\"errors\":{" + errFields + "}"
                + "}";
    }

    private static String escape(String s) {
        return s == null ? "" : s.replace("\\", "\\\\").replace("\"", "\\\"");
    }
}
