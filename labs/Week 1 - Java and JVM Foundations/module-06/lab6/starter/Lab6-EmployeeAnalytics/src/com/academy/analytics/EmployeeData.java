package com.academy.analytics;

import java.util.ArrayList;
import java.util.List;

public final class EmployeeData {

    private EmployeeData() {
    }

    public static List<Employee> createSampleEmployees() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("E001", "John Smith", "IT", 165000, 12, 5, true));
        employees.add(new Employee("E002", "Alice Johnson", "Finance", 152000, 10, 5, true));
        employees.add(new Employee("E003", "David Lee", "Sales", 149000, 14, 4, true));
        employees.add(new Employee("E004", "Sarah Brown", "IT", 141000, 9, 5, true));
        employees.add(new Employee("E005", "Michael Chen", "Marketing", 138000, 11, 4, true));
        employees.add(new Employee("E006", "Emily Davis", "HR", 92000, 7, 4, true));
        employees.add(new Employee("E007", "Robert Wilson", "IT", 118000, 8, 4, true));
        employees.add(new Employee("E008", "Laura Martinez", "Finance", 99000, 6, 3, true));
        employees.add(new Employee("E009", "James Taylor", "Sales", 87000, 5, 3, true));
        employees.add(new Employee("E010", "Olivia Anderson", "Marketing", 76000, 4, 4, true));
        employees.add(new Employee("E011", "Daniel Thomas", "HR", 68000, 3, 3, true));
        employees.add(new Employee("E012", "Sophia Jackson", "IT", 132000, 13, 5, true));
        employees.add(new Employee("E013", "William White", "Finance", 105000, 9, 4, true));
        employees.add(new Employee("E014", "Ava Harris", "Sales", 94000, 6, 4, true));
        employees.add(new Employee("E015", "Ethan Clark", "Marketing", 72000, 2, 3, true));
        employees.add(new Employee("E016", "Mia Lewis", "HR", 61000, 2, 2, true));
        employees.add(new Employee("E017", "Noah Walker", "IT", 98000, 7, 4, true));
        employees.add(new Employee("E018", "Isabella Hall", "Finance", 84000, 5, 3, true));
        employees.add(new Employee("E019", "Liam Allen", "Sales", 58000, 1, 2, true));
        employees.add(new Employee("E020", "Charlotte Young", "Marketing", 54000, 1, 3, true));
        employees.add(new Employee("E021", "Benjamin King", "IT", 124000, 10, 4, true));
        employees.add(new Employee("E022", "Amelia Wright", "HR", 48000, 1, 2, false));
        employees.add(new Employee("E023", "Lucas Scott", "Finance", 112000, 8, 4, true));
        employees.add(new Employee("E024", "Harper Green", "Sales", 101000, 7, 5, true));
        employees.add(new Employee("E025", "Henry Adams", "Marketing", 89000, 6, 3, false));

        return employees;
    }
}
