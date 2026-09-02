package com.northstar.crm.account;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Account {
  @Id
  private String id;
  private String customerId;
  private String type;
  private BigDecimal balance;

  public Account() {}

  public Account(String id, String customerId, String type, BigDecimal balance) {
    this.id = id;
    this.customerId = customerId;
    this.type = type;
    this.balance = balance;
  }

  public String getId() { return id; }
  public void setId(String id) { this.id = id; }
  public String getCustomerId() { return customerId; }
  public void setCustomerId(String customerId) { this.customerId = customerId; }
  public String getType() { return type; }
  public void setType(String type) { this.type = type; }
  public BigDecimal getBalance() { return balance; }
  public void setBalance(BigDecimal balance) { this.balance = balance; }
}
