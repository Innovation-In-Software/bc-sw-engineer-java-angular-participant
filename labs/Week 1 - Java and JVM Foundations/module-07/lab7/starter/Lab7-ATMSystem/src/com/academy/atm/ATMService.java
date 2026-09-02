package com.academy.atm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ATMService {

    private static final int MAX_PIN_ATTEMPTS = 3;
    private static final String TRANSACTION_FILE = "transactions.txt";

    private final Map<String, Account> accounts = new HashMap<>();
    private final List<Transaction> sessionTransactions = new ArrayList<>();
    private final Scanner scanner;

    private Account loggedInAccount;
    private int pinAttemptsRemaining = MAX_PIN_ATTEMPTS;

    public ATMService(Scanner scanner) {
        this.scanner = scanner;
        initializeAccounts();
    }

    private void initializeAccounts() {
        accounts.put("1001", new Account("1001", "John Smith", "1234", 11000));
        accounts.put("1002", new Account("1002", "Alice Johnson", "5678", 5000));
    }

    public void login() {
        // TODO: if already logged in, print message and return
        // TODO: read account number; findAccount; read PIN
        // TODO: on bad PIN decrement attempts + throw InvalidPinException
        // TODO: on success set loggedInAccount, reset attempts, log + "Login Successful"
        // TODO: catch AccountNotFoundException | InvalidPinException; finally printReturnMessage
        throw new UnsupportedOperationException("TODO");
    }

    public void deposit() {
        // TODO: executeTransaction("Deposit", ...) — requireLogin, readAmount, deposit, record, print
        throw new UnsupportedOperationException("TODO");
    }

    public void withdraw() {
        // TODO: executeTransaction("Withdraw", ...) — requireLogin, readAmount, withdraw, record, print
        throw new UnsupportedOperationException("TODO");
    }

    public void displayBalance() {
        executeTransaction("Balance Inquiry", () -> {
            requireLogin();
            loggedInAccount.displayBalance();
        });
    }

    public void transferFunds() {
        System.out.println("Bonus / full-path feature — implement after core TODOs.");
    }

    public void displayMiniStatement() {
        executeTransaction("Mini Statement", () -> {
            requireLogin();
            System.out.println("Session Transactions:");
            sessionTransactions.stream()
                    .filter(transaction -> loggedInAccount.getAccountNumber().equals(transaction.getAccountNumber()))
                    .forEach(System.out::println);

            System.out.println();
            System.out.println("Historical Transactions (from file):");
            loadTransactionsFromFile();
        });
    }

    public void demonstrateUncheckedExceptions() {
        System.out.println("--- Unchecked Exception Demonstrations ---");

        try {
            Account account = null;
            account.getBalance();
        } catch (NullPointerException ex) {
            System.out.println("Handled NullPointerException gracefully.");
            LoggerUtil.logError("NullPointerException demonstration", ex);
        }

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException ex) {
            System.out.println("Handled ArithmeticException gracefully.");
            LoggerUtil.logError("ArithmeticException demonstration", ex);
        }

        try {
            int[] values = {1, 2, 3};
            System.out.println(values[10]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Handled ArrayIndexOutOfBoundsException gracefully.");
            LoggerUtil.logError("ArrayIndexOutOfBoundsException demonstration", ex);
        }
    }

    public void generateDailyErrorReport() {
        System.out.println("Bonus / full-path feature — implement after core TODOs.");
    }

    public void generateTransactionSummary() {
        System.out.println("Bonus / full-path feature — implement after core TODOs.");
    }

    public void logout() {
        loggedInAccount = null;
    }

    private void executeTransaction(String operationName, TransactionAction action) {
        long startTime = System.nanoTime();
        try {
            action.run();
            LoggerUtil.logTransaction(operationName + " completed successfully",
                    (System.nanoTime() - startTime) / 1_000_000);
        } catch (InputMismatchException ex) {
            scanner.nextLine();
            System.out.println("ERROR");
            System.out.println("Invalid numeric input.");
            System.out.println("Please enter a valid amount.");
            LoggerUtil.logError("Invalid numeric input during " + operationName, ex);
            recordFailedTransaction(operationName, ex.getMessage());
        } catch (InvalidAmountException ex) {
            System.out.println("ERROR");
            System.out.println(ex.getMessage());
            LoggerUtil.logError(ex.getMessage(), ex);
            recordFailedTransaction(operationName, ex.getMessage());
        } catch (InsufficientFundsException ex) {
            System.out.println("ERROR");
            System.out.println("Insufficient Balance");
            System.out.println("Transaction Cancelled");
            LoggerUtil.logError("Requested " + ex.getRequestedAmount()
                    + " Balance " + ex.getAvailableBalance(), ex);
            recordFailedTransaction(operationName, ex.getMessage());
        } catch (InvalidPinException | AccountNotFoundException ex) {
            System.out.println("ERROR");
            System.out.println(ex.getMessage());
            LoggerUtil.logError(ex.getMessage(), ex);
            recordFailedTransaction(operationName, ex.getMessage());
        } catch (Exception ex) {
            System.out.println("ERROR");
            System.out.println("Unexpected error occurred. Please try again.");
            LoggerUtil.logError("Unexpected error during " + operationName, ex);
            recordFailedTransaction(operationName, ex.getMessage());
        } finally {
            printReturnMessage();
        }
    }

    private void loadTransactionsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(TRANSACTION_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("Unable to read transaction history.");
            LoggerUtil.logError("Unable to read transaction history", ex);
        }
    }

    private Account findAccount(String accountNumber) throws AccountNotFoundException {
        Account account = accounts.get(accountNumber);
        if (account == null) {
            throw new AccountNotFoundException("Account not found: " + accountNumber);
        }
        return account;
    }

    private void requireLogin() throws InvalidPinException {
        if (loggedInAccount == null) {
            throw new InvalidPinException("Please login before performing this operation.", pinAttemptsRemaining);
        }
    }

    private double readAmount(String prompt) throws InputMismatchException {
        System.out.print(prompt);
        String input = scanner.nextLine().trim();
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException ex) {
            throw new InputMismatchException("Invalid numeric input.");
        }
    }

    private void recordTransaction(String type, double amount, boolean successful, String details) {
        if (loggedInAccount == null) {
            return;
        }
        sessionTransactions.add(new Transaction(
                loggedInAccount.getAccountNumber(), type, amount, successful, details));
    }

    private void recordFailedTransaction(String type, String details) {
        if (loggedInAccount == null) {
            return;
        }
        sessionTransactions.add(new Transaction(
                loggedInAccount.getAccountNumber(), type, 0, false, details));
    }

    private void printReturnMessage() {
        System.out.println("Transaction Completed.");
        System.out.println("Returning to Main Menu.");
    }

    @FunctionalInterface
    private interface TransactionAction {
        void run() throws Exception;
    }
}
