package com.northstar.crm.account;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import java.time.Instant;

@Entity
@Table(name = "account")
public class AccountEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "account_id")
  private Long accountId;

  @Column(name = "customer_id", nullable = false)
  private Long customerId;

  @Column(name = "account_number", nullable = false, unique = true)
  private String accountNumber;

  @Column(name = "balance_cents", nullable = false)
  private long balanceCents;

  @Version
  private Long version;

  @Column(name = "opened_at", nullable = false)
  private Instant openedAt = Instant.now();

  public Long getAccountId() { return accountId; }
  public Long getCustomerId() { return customerId; }
  public void setCustomerId(Long customerId) { this.customerId = customerId; }
  public String getAccountNumber() { return accountNumber; }
  public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
}
