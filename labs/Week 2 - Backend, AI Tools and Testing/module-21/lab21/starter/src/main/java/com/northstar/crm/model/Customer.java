package com.northstar.crm.model;

public class Customer {
    private String customerId;
    private String fullName;
    private String email;
    private String status;

    public Customer() {}

    public Customer(String customerId, String fullName, String email, String status) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.email = email;
        this.status = status;
    }

    public static Customer amina() {
        return new Customer("CUS-1001", "Amina Khan", "amina.khan@example.com", "ACTIVE");
    }

    public static Customer ravi() {
        return new Customer("CUS-1002", "Ravi Singh", "ravi.singh@example.com", "PROSPECT");
    }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
