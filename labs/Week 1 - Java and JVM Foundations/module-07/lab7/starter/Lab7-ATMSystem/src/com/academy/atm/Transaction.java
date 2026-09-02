package com.academy.atm;

import java.time.LocalDateTime;

public class Transaction {

    private final String accountNumber;
    private final String type;
    private final double amount;
    private final LocalDateTime timestamp;
    private final boolean successful;
    private final String details;

    public Transaction(String accountNumber, String type, double amount,
                       boolean successful, String details) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.successful = successful;
        this.details = details;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return String.format("%s | %s | $%.2f | %s | %s",
                timestamp, type, amount, successful ? "SUCCESS" : "FAILED", details);
    }
}
