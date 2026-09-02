package com.academy.atm;

public class Account {

    private final String accountNumber;
    private final String customerName;
    private final String pin;
    private double balance;

    public Account(String accountNumber, String customerName, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    void restoreBalance(double targetBalance) {
        this.balance = targetBalance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero.");
        }

        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Transaction Failed. Insufficient Account Balance.",
                    amount,
                    balance);
        }

        balance -= amount;
    }

    public void displayBalance() {
        System.out.printf("Account : %s | Customer : %s | Balance : $%.2f%n",
                accountNumber, customerName, balance);
    }
}
