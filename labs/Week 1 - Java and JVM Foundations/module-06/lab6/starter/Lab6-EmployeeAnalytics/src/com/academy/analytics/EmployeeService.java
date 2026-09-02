package com.academy.analytics;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class EmployeeService {

    private final List<Employee> employees;

    public EmployeeService(List<Employee> employees) {
        this.employees = new ArrayList<>(employees);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    // --- CORE (menus 1–9) — keep throwing until implemented ---

    public void displayAllEmployees() {
        System.out.println("Total Employees : " + employees.size());
        System.out.println("Employee List");
        // TODO (menu 1): stream forEach print each employee
        throw new UnsupportedOperationException("TODO");
    }

    public void displayActiveEmployees() {
        System.out.println("Active Employees:");
        // TODO (menu 7): filter Employee::isActive; forEach
        throw new UnsupportedOperationException("TODO");
    }

    public void displayGroupedEmployees() {
        // TODO (menu 2): groupingBy department; print each group
        throw new UnsupportedOperationException("TODO");
    }

    public void displayReductions() {
        // TODO (menu 3): highest/lowest via reduce; total/average via mapToDouble
        throw new UnsupportedOperationException("TODO");
    }

    public void displaySummaryStatistics() {
        // TODO (menu 3): summarizingDouble salary; print max/min/avg/sum/count
        throw new UnsupportedOperationException("TODO");
    }

    public void displayPartitionedEmployees() {
        // TODO (menu 3): partitioningBy salary > 100_000
        throw new UnsupportedOperationException("TODO");
    }

    public void displayHighestPaidEmployeeOptional() {
        // TODO (menu 5): max by salary; ifPresentOrElse
        throw new UnsupportedOperationException("TODO");
    }

    public Optional<Employee> findTopPerformer() {
        // TODO (menu 8 dashboard): max by rating then salary
        throw new UnsupportedOperationException("TODO");
    }

    public List<Employee> getTopSalaries(int count) {
        // TODO (menu 8 dashboard): sorted salary desc; limit count; toList
        throw new UnsupportedOperationException("TODO");
    }

    public List<Employee> getTopPerformers(int minimumRating) {
        // TODO (menu 4): filter rating >= minimum; sort; toList
        throw new UnsupportedOperationException("TODO");
    }

    public Map<String, DoubleSummaryStatistics> getDepartmentStatistics() {
        // TODO (menu 6): groupingBy department + summarizingDouble salary
        throw new UnsupportedOperationException("TODO");
    }

    public Optional<String> findDepartmentWithHighestAverageSalary() {
        // TODO (menu 8 dashboard): groupingBy averagingDouble; max entry; map key
        throw new UnsupportedOperationException("TODO");
    }

    // --- BONUS / DEMO (menus 10–21) — stub so explorers do not crash ---

    public void demonstrateLambdas() {
        System.out.println("Bonus / full-path feature — implement after CORE");
    }

    public void demonstrateFunctionalInterfaces() {
        System.out.println("Bonus / full-path feature — implement after CORE");
    }

    public void demonstrateStreamSources() {
        System.out.println("Bonus / full-path feature — implement after CORE");
    }

    public void displayHighSalaryEmployees() {
        System.out.println("Bonus / full-path feature — implement after CORE");
    }

    public void displayItEmployees() {
        System.out.println("Bonus / full-path feature — implement after CORE");
    }

    public void displayFilteredItTopPerformers() {
        System.out.println("Bonus / full-path feature — implement after CORE");
    }

    public void demonstrateMapping() {
        System.out.println("Bonus / full-path feature — implement after CORE");
    }

    public void demonstrateSorting() {
        System.out.println("Bonus / full-path feature — implement after CORE");
    }

    public void displayDistinctDepartments() {
        System.out.println("Bonus / full-path feature — implement after CORE");
    }

    public void displayTopAndNextSalaries() {
        System.out.println("Bonus / full-path feature — implement after CORE");
    }

    public void displayCounts() {
        System.out.println("Bonus / full-path feature — implement after CORE");
    }

    public void demonstrateCollectors() {
        System.out.println("Bonus / full-path feature — implement after CORE");
    }

    public Optional<Employee> findHighestPaidEmployee() {
        System.out.println("Bonus / full-path feature — implement after CORE");
        return Optional.empty();
    }

    public Optional<Double> findSecondHighestSalary() {
        System.out.println("Bonus / full-path feature — implement after CORE");
        return Optional.empty();
    }

    public Optional<Employee> findEmployeeWithLongestName() {
        System.out.println("Bonus / full-path feature — implement after CORE");
        return Optional.empty();
    }

    public Map<String, Long> generateSalaryHistogram() {
        System.out.println("Bonus / full-path feature — implement after CORE");
        return Map.of();
    }

    public String collectEmployeeSummary() {
        System.out.println("Bonus / full-path feature — implement after CORE");
        return "";
    }
}
