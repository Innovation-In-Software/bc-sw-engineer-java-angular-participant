package com.academy.analytics;

public class ReportService {

    private final EmployeeService employeeService;

    public ReportService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // --- CORE (menus 1–9) — keep throwing until implemented ---

    public void displayDashboard() {
        // TODO (menu 8): stream stats (avg/max/min), department count, active/inactive
        // TODO: top performer, highest-paid dept, top 5 salaries — print dashboard block
        // Expected with solution seed: Average Salary : 100680
        throw new UnsupportedOperationException("TODO");
    }

    public void displayEmployeesByDepartment() {
        employeeService.displayGroupedEmployees();
    }

    public void displaySalaryReport() {
        employeeService.displayReductions();
        System.out.println();
        employeeService.displaySummaryStatistics();
        System.out.println();
        employeeService.displayPartitionedEmployees();
    }

    public void displayTopPerformers() {
        System.out.println("Top Performers (Rating >= 4):");
        // TODO (menu 4): employeeService.getTopPerformers(4).forEach(...)
        throw new UnsupportedOperationException("TODO");
    }

    public void displayHighestSalary() {
        employeeService.displayHighestPaidEmployeeOptional();
    }

    public void displayDepartmentStatistics() {
        // TODO (menu 6): getDepartmentStatistics(); print count/avg/max/min per dept
        throw new UnsupportedOperationException("TODO");
    }

    public void displayActiveEmployees() {
        employeeService.displayActiveEmployees();
    }

    // --- BONUS (menu 21) ---

    public void displayBonusInsights() {
        System.out.println("Bonus / full-path feature — implement after CORE");
    }
}
