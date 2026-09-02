package com.academy.bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankService bankService = new BankService(scanner);

        while (true) {
            displayMenu();
            String choiceInput = scanner.nextLine().trim();

            if (choiceInput.isEmpty()) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            int choice;
            try {
                choice = Integer.parseInt(choiceInput);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.println("----------------------------------");

            switch (choice) {
                case 1 -> bankService.createCustomer();
                case 2 -> bankService.createSavingsAccount();
                case 3 -> bankService.createCurrentAccount();
                case 4 -> bankService.deposit();
                case 5 -> bankService.withdraw();
                case 6 -> bankService.displayAccounts();
                case 7 -> bankService.displayCustomers();
                case 8 -> {
                    System.out.println("Thank You");
                    scanner.close();
                    return;
                }
                case 9 -> bankService.transferMoney();
                case 10 -> bankService.displayTransactionHistory();
                case 11 -> bankService.displayAccountsSortedByBalance();
                case 12 -> bankService.displayHighestBalanceCustomer();
                case 13 -> bankService.generateAccountSummaryReport();
                default -> System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }
    }

    private static void displayMenu() {
        System.out.println("================================");
        System.out.println("Bank Management System");
        System.out.println("================================");
        System.out.println("1 Create Customer");
        System.out.println("2 Create Savings Account");
        System.out.println("3 Create Current Account");
        System.out.println("4 Deposit");
        System.out.println("5 Withdraw");
        System.out.println("6 Display Accounts");
        System.out.println("7 Display Customers");
        System.out.println("8 Exit");
        System.out.println("9 Transfer Money (Bonus)");
        System.out.println("10 Transaction History (Bonus)");
        System.out.println("11 Sort Accounts by Balance (Bonus)");
        System.out.println("12 Highest Balance Customer (Bonus)");
        System.out.println("13 Account Summary Report (Bonus)");
        System.out.print("Choice : ");
    }
}
