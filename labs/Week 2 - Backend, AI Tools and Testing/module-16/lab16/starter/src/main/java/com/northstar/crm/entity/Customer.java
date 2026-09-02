package com.northstar.crm.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Customer {
    private String customerId;
    private String fullName;
    private String email;
    private String phone;
    private CustomerStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Customer() {}

    public Customer(String customerId, String fullName, String email, String phone,
                    CustomerStatus status, LocalDateTime createdAt) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = createdAt;
    }

    public static Customer amina() {
        return new Customer("CUS-1001", "Amina Khan", "amina.khan@example.com", null,
                CustomerStatus.ACTIVE, LocalDateTime.now());
    }

    public static Customer ravi() {
        return new Customer("CUS-1002", "Ravi Singh", "ravi.singh@example.com", null,
                CustomerStatus.PROSPECT, LocalDateTime.now());
    }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public CustomerStatus getStatus() { return status; }
    public void setStatus(CustomerStatus status) { this.status = status; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
    public void touchUpdatedAt() { this.updatedAt = LocalDateTime.now(); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer other)) return false;
        return Objects.equals(customerId, other.customerId);
    }

    @Override
    public int hashCode() { return Objects.hash(customerId); }

    @Override
    public String toString() {
        return "Customer{customerId='" + customerId + "', status=" + status + "}";
    }
}
