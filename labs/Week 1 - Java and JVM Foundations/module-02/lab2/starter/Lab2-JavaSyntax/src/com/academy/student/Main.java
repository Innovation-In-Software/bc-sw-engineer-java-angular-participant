package com.academy.student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager(scanner);

        while (true) {
            studentManager.displayMenu();

            String choiceInput = scanner.nextLine().trim();
            if (choiceInput.isEmpty()) {
                System.out.println("Invalid Input");
                System.out.println("Please Try Again.");
                continue;
            }

            int choice;
            try {
                choice = Integer.parseInt(choiceInput);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid Input");
                System.out.println("Please Try Again.");
                continue;
            }

            switch (choice) {
                case 1 -> studentManager.addStudent();
                case 2 -> studentManager.displayStudents();
                case 3 -> studentManager.searchStudent();
                case 4 -> studentManager.calculateAverage();
                case 5 -> {
                    System.out.println("Thank You");
                    scanner.close();
                    return;
                }
                // TODO (bonus / full path): wire cases 6–10 to StudentManager bonus methods
                case 6, 7, 8, 9, 10 -> System.out.println("Bonus menu — complete after core path (or as homework).");
                default -> {
                    System.out.println("Invalid Input");
                    System.out.println("Please Try Again.");
                }
            }

            System.out.println();
        }
    }
}
