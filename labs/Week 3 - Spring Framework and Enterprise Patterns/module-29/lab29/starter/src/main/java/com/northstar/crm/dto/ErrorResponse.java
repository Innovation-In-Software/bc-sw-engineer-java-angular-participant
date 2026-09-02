package com.northstar.crm.dto;

import java.time.Instant;
import java.util.List;

public class ErrorResponse {
  private Instant timestamp = Instant.now();
  private int status;
  private String error;
  private String message;
  private String correlationId;
  private List<FieldViolation> violations;

  public static class FieldViolation {
    private String field;
    private String message;
    public FieldViolation() {}
    public FieldViolation(String field, String message) {
      this.field = field;
      this.message = message;
    }
    public String getField() { return field; }
    public void setField(String field) { this.field = field; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
  }

  public Instant getTimestamp() { return timestamp; }
  public int getStatus() { return status; }
  public void setStatus(int status) { this.status = status; }
  public String getError() { return error; }
  public void setError(String error) { this.error = error; }
  public String getMessage() { return message; }
  public void setMessage(String message) { this.message = message; }
  public String getCorrelationId() { return correlationId; }
  public void setCorrelationId(String correlationId) { this.correlationId = correlationId; }
  public List<FieldViolation> getViolations() { return violations; }
  public void setViolations(List<FieldViolation> violations) { this.violations = violations; }
}
