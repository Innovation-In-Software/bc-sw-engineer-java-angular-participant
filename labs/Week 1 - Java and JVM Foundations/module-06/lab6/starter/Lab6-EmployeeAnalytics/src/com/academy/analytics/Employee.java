package com.academy.analytics;

public class Employee {

    private String employeeId;
    private String name;
    private String department;
    private double salary;
    private int experience;
    private int rating;
    private boolean active;

    public Employee(String employeeId, String name, String department, double salary,
                    int experience, int rating, boolean active) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.experience = experience;
        this.rating = rating;
        this.active = active;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %s | $%.0f | %d yrs | Rating %d | %s",
                employeeId, name, department, salary, experience, rating,
                active ? "Active" : "Inactive");
    }
}
