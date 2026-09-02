package com.northstar.crm.account;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
public class TransactionLog {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String fromAccountId;
  private String toAccountId;
  private BigDecimal amount;
  private Instant createdAt = Instant.now();

  public Long getId() { return id; }
  public String getFromAccountId() { return fromAccountId; }
  public void setFromAccountId(String fromAccountId) { this.fromAccountId = fromAccountId; }
  public String getToAccountId() { return toAccountId; }
  public void setToAccountId(String toAccountId) { this.toAccountId = toAccountId; }
  public BigDecimal getAmount() { return amount; }
  public void setAmount(BigDecimal amount) { this.amount = amount; }
  public Instant getCreatedAt() { return createdAt; }
}
