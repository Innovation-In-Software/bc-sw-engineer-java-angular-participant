package com.academy.bank;

public class SavingsAccount extends Account implements Printable {

    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, Customer customer, double interestRate) {
        super(accountNumber, balance, customer);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        // TODO: return getBalance() * interestRate / 100.0
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public void displayAccount() {
        System.out.println("Savings Account");
        System.out.println("Account Number : " + getAccountNumber());
        System.out.println("Customer : " + getCustomer().getName());
        System.out.printf("Balance : %.0f%n", getBalance());
        System.out.printf("Interest Rate : %.0f%%%n", interestRate);
        System.out.printf("Interest : %.0f%n", calculateInterest());
    }

    @Override
    public void printDetails() {
        displayAccount();
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }
}
