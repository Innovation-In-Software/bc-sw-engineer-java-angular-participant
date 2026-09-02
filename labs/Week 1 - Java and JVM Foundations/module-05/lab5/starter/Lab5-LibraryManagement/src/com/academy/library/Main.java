package com.academy.library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryService libraryService = new LibraryService(scanner);

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
                case 1 -> libraryService.addBook();
                case 2 -> libraryService.registerMember();
                case 3 -> libraryService.displayBooks();
                case 4 -> libraryService.displayMembers();
                case 5 -> libraryService.searchBook();
                case 6 -> libraryService.borrowBook();
                case 7 -> libraryService.returnBook();
                case 8 -> libraryService.displayBorrowedBooks();
                case 9 -> libraryService.sortBooks();
                case 10 -> libraryService.displayReports();
                case 11 -> {
                    System.out.println("Thank You");
                    scanner.close();
                    return;
                }
                case 12 -> libraryService.displayAvailableBooks();
                case 13 -> libraryService.displayCategoryInsights();
                case 14 -> libraryService.runPerformanceComparison();
                case 15 -> libraryService.displayBorrowHistory();
                case 16 -> libraryService.displayTopBorrowedBooks();
                case 17 -> libraryService.exportReport();
                default -> System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }
    }

    private static void displayMenu() {
        System.out.println("=====================================");
        System.out.println("Library Management System");
        System.out.println("=====================================");
        System.out.println("1 Add Book");
        System.out.println("2 Register Member");
        System.out.println("3 Display Books");
        System.out.println("4 Display Members");
        System.out.println("5 Search Book");
        System.out.println("6 Borrow Book");
        System.out.println("7 Return Book");
        System.out.println("8 Display Borrowed Books");
        System.out.println("9 Sort Books");
        System.out.println("10 Reports");
        System.out.println("11 Exit");
        System.out.println("12 Display Available Books");
        System.out.println("13 Category Insights (TreeSet/TreeMap)");
        System.out.println("14 Performance Comparison (Bonus)");
        System.out.println("15 Borrow History (Bonus)");
        System.out.println("16 Top 5 Borrowed Books (Bonus)");
        System.out.println("17 Export Report (Bonus)");
        System.out.print("Choice : ");
    }
}
