package com.academy.bank;

public class Customer implements Printable {

    private String customerId;
    private String name;
    private String email;
    private String phone;

    public Customer(String customerId, String name, String email, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void display() {
        System.out.println("Customer ID : " + customerId);
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Phone : " + phone);
    }

    @Override
    public void printDetails() {
        display();
    }
}
