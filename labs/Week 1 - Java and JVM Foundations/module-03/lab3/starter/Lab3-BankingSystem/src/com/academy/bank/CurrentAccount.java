package com.academy.bank;

public class CurrentAccount extends Account implements Printable {

    private double transactionFee;

    public CurrentAccount(String accountNumber, double balance, Customer customer, double transactionFee) {
        super(accountNumber, balance, customer);
        this.transactionFee = transactionFee;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    @Override
    public double calculateCharges() {
        // TODO: return transactionFee
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public void displayAccount() {
        System.out.println("Current Account");
        System.out.println("Account Number : " + getAccountNumber());
        System.out.println("Customer : " + getCustomer().getName());
        System.out.printf("Balance : %.0f%n", getBalance());
        System.out.printf("Transaction Fee : %.0f%n", transactionFee);
    }

    @Override
    public void printDetails() {
        displayAccount();
    }

    @Override
    public String getAccountType() {
        return "Current";
    }
}
