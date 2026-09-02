package com.academy.student;

public class Student {

    private int studentId;
    private String name;
    private String course;
    private double marks;

    public Student(int studentId, String name, String course, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void display() {
        System.out.println("ID : " + studentId);
        System.out.println("Name : " + name);
        System.out.println("Course : " + course);
        System.out.println("Marks : " + marks);
    }

    public String getPassFailStatus() {
        return marks >= 50 ? "Pass" : "Fail";
    }
}
