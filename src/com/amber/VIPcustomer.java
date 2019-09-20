package com.amber;

public class VIPcustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VIPcustomer() {
        this("Name not on file", 00.00, "Email not on file");
    }

    public VIPcustomer(String name, double creditLimit) {
       this(name, creditLimit, "Email not on file");
    }

    public VIPcustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
