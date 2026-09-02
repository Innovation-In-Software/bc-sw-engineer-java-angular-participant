package com.northstar.crm.model;

public class Customer {
  private String id;
  private String name;
  private String email;
  private String status;

  public Customer() {}

  public Customer(String id, String name, String email, String status) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.status = status;
  }

  public static Customer amina() {
    return new Customer("CUS-1001", "Amina Khan", "amina.khan@example.com", "ACTIVE");
  }

  public static Customer ravi() {
    return new Customer("CUS-1002", "Ravi Singh", "ravi.singh@example.com", "PROSPECT");
  }

  public String getId() { return id; }
  public void setId(String id) { this.id = id; }
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  public String getEmail() { return email; }
  public void setEmail(String email) { this.email = email; }
  public String getStatus() { return status; }
  public void setStatus(String status) { this.status = status; }
}
