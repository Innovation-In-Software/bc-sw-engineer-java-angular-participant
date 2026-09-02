package com.academy.atm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATMService atmService = new ATMService(scanner);

        while (true) {
            displayMenu();
            String choiceInput = scanner.nextLine().trim();

            if (choiceInput.isEmpty()) {
                System.out.println("Invalid menu option. Please try again.");
                continue;
            }

            int choice;
            try {
                choice = Integer.parseInt(choiceInput);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid menu option. Please try again.");
                LoggerUtil.logError("Invalid menu option: " + choiceInput, ex);
                continue;
            }

            System.out.println("--------------------------------");

            switch (choice) {
                case 1 -> atmService.login();
                case 2 -> atmService.deposit();
                case 3 -> atmService.withdraw();
                case 4 -> atmService.displayBalance();
                case 5 -> atmService.transferFunds();
                case 6 -> atmService.displayMiniStatement();
                case 7 -> {
                    System.out.println("Thank You");
                    atmService.logout();
                    scanner.close();
                    return;
                }
                case 8 -> atmService.demonstrateUncheckedExceptions();
                case 9 -> atmService.generateDailyErrorReport();
                case 10 -> atmService.generateTransactionSummary();
                default -> {
                    System.out.println("Invalid menu option. Please try again.");
                    LoggerUtil.logInfo("Invalid menu selection: " + choice);
                }
            }

            System.out.println();
        }
    }

    private static void displayMenu() {
        System.out.println("=================================");
        System.out.println("ATM Banking System");
        System.out.println("=================================");
        System.out.println("1 Login");
        System.out.println("2 Deposit");
        System.out.println("3 Withdraw");
        System.out.println("4 Balance Inquiry");
        System.out.println("5 Transfer (Bonus)");
        System.out.println("6 Mini Statement");
        System.out.println("7 Exit");
        System.out.println("8 Unchecked Exception Demo");
        System.out.println("9 Daily Error Report (Bonus)");
        System.out.println("10 Transaction Summary (Bonus)");
        System.out.print("Choice : ");
    }
}
