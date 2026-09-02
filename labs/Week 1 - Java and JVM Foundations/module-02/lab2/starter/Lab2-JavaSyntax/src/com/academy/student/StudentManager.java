package com.academy.student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManager {

    private static final int MAX_STUDENTS = 20;

    private final Student[] students = new Student[MAX_STUDENTS];
    private int studentCount = 0;
    private final Scanner scanner;

    public StudentManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayMenu() {
        System.out.println("====================================");
        System.out.println("Student Management System");
        System.out.println("====================================");
        System.out.println("1. Add Student");
        System.out.println("2. Display Students");
        System.out.println("3. Search Student");
        System.out.println("4. Average Marks");
        System.out.println("5. Exit");
        System.out.println("6. Top Student (Bonus)");
        System.out.println("7. Lowest Marks (Bonus)");
        System.out.println("8. Pass / Fail Report (Bonus)");
        System.out.println("9. Sort by Marks (Bonus)");
        System.out.println("10. Class Statistics (Bonus)");
        System.out.print("Enter Choice : ");
    }

    public void addStudent() {
        // TODO: reject when studentCount >= MAX_STUDENTS
        // TODO: read studentId (positive int); reject duplicate IDs via findStudentIndex
        // TODO: read name, course, marks; store new Student at students[studentCount++]
        // TODO: print "Student Added Successfully."
        throw new UnsupportedOperationException("TODO");
    }

    public void displayStudents() {
        // TODO: if empty, print "No students to display."
        // TODO: otherwise call printStudentTable(students, studentCount, false)
        throw new UnsupportedOperationException("TODO");
    }

    public void searchStudent() {
        // TODO: read Student ID; find index; print display() or "Student Not Found."
        throw new UnsupportedOperationException("TODO");
    }

    public void calculateAverage() {
        // TODO: average of students[0..studentCount); printf "Average Marks : %.2f%n"
        throw new UnsupportedOperationException("TODO");
    }

    public void displayTopStudent() {
        Student topStudent = findTopStudent();
        if (topStudent == null) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("Top Student");
        System.out.println(topStudent.getName());
        System.out.printf("%.2f%n", topStudent.getMarks());
    }

    public void displayLowestMarks() {
        Student lowestStudent = findLowestStudent();
        if (lowestStudent == null) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("Lowest Marks Student");
        System.out.println(lowestStudent.getName());
        System.out.printf("%.2f%n", lowestStudent.getMarks());
    }

    public void displayPassFailReport() {
        if (studentCount == 0) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("----------------------------------------------------------");
        System.out.printf("%-8s %-20s %-15s %-8s%n", "ID", "Name", "Course", "Status");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];
            System.out.printf("%-8d %-20s %-15s %-8s%n",
                    student.getStudentId(),
                    student.getName(),
                    student.getCourse(),
                    student.getPassFailStatus());
        }

        System.out.println("----------------------------------------------------------");
    }

    public void displayStudentsSortedByMarks() {
        if (studentCount == 0) {
            System.out.println("No students to display.");
            return;
        }

        Student[] sortedStudents = Arrays.copyOf(students, studentCount);
        Arrays.sort(sortedStudents, Comparator.comparingDouble(Student::getMarks).reversed());
        printStudentTable(sortedStudents, studentCount, false);
    }

    public void displayClassStatistics() {
        if (studentCount == 0) {
            System.out.println("No students available.");
            return;
        }

        Student topStudent = findTopStudent();
        Student lowestStudent = findLowestStudent();
        double total = 0;

        for (int i = 0; i < studentCount; i++) {
            total += students[i].getMarks();
        }

        double average = total / studentCount;

        System.out.println("Class Statistics");
        System.out.printf("Highest Marks : %.2f (%s)%n", topStudent.getMarks(), topStudent.getName());
        System.out.printf("Lowest Marks : %.2f (%s)%n", lowestStudent.getMarks(), lowestStudent.getName());
        System.out.printf("Average : %.2f%n", average);
        System.out.println("Total Students : " + studentCount);
    }

    private void printStudentTable(Student[] studentList, int count, boolean includeStatus) {
        System.out.println("----------------------------------------------------------");
        if (includeStatus) {
            System.out.printf("%-8s %-20s %-15s %-8s %-8s%n", "ID", "Name", "Course", "Marks", "Status");
        } else {
            System.out.printf("%-8s %-20s %-15s %-8s%n", "ID", "Name", "Course", "Marks");
        }
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < count; i++) {
            Student student = studentList[i];
            if (includeStatus) {
                System.out.printf("%-8d %-20s %-15s %-8.2f %-8s%n",
                        student.getStudentId(),
                        student.getName(),
                        student.getCourse(),
                        student.getMarks(),
                        student.getPassFailStatus());
            } else {
                System.out.printf("%-8d %-20s %-15s %-8.2f%n",
                        student.getStudentId(),
                        student.getName(),
                        student.getCourse(),
                        student.getMarks());
            }
        }

        System.out.println("----------------------------------------------------------");
    }

    private Student findTopStudent() {
        if (studentCount == 0) {
            return null;
        }

        Student topStudent = students[0];
        for (int i = 1; i < studentCount; i++) {
            if (students[i].getMarks() > topStudent.getMarks()) {
                topStudent = students[i];
            }
        }
        return topStudent;
    }

    private Student findLowestStudent() {
        if (studentCount == 0) {
            return null;
        }

        Student lowestStudent = students[0];
        for (int i = 1; i < studentCount; i++) {
            if (students[i].getMarks() < lowestStudent.getMarks()) {
                lowestStudent = students[i];
            }
        }
        return lowestStudent;
    }

    private int findStudentIndex(int studentId) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId() == studentId) {
                return i;
            }
        }
        return -1;
    }

    private String readNonEmptyLine(String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = scanner.nextLine().trim();
            if (!value.isEmpty()) {
                return value;
            }
            System.out.println("Invalid Input");
            System.out.println("Please Try Again.");
        }
    }

    private double readValidMarks() {
        while (true) {
            System.out.print("Marks : ");
            String input = scanner.nextLine().trim();
            try {
                double marks = Double.parseDouble(input);
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid Input");
                    System.out.println("Please Try Again.");
                    continue;
                }
                return marks;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid Input");
                System.out.println("Please Try Again.");
            }
        }
    }

    private int readPositiveInt() {
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                int value = Integer.parseInt(input);
                if (value <= 0) {
                    System.out.println("Invalid Input");
                    System.out.println("Please Try Again.");
                    continue;
                }
                return value;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid Input");
                System.out.println("Please Try Again.");
            }
        }
    }
}
