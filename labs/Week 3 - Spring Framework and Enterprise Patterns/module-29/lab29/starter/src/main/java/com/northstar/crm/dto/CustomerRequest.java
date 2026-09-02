package com.northstar.crm.dto;

// TODO: add jakarta.validation annotations:
// @NotBlank on id, name, email, status
// @Email on email
public class CustomerRequest {
  private String id;
  private String name;
  private String email;
  private String status;

  public String getId() { return id; }
  public void setId(String id) { this.id = id; }
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  public String getEmail() { return email; }
  public void setEmail(String email) { this.email = email; }
  public String getStatus() { return status; }
  public void setStatus(String status) { this.status = status; }
}
