package com.amber;

public class Accounting {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;


    //overloading
    public Accounting(){
        //default values
        this("0000", 00.00, "Jane Doe", "default@rbfcu.org", "Not Listed" );
    }

    public Accounting(String number, double balance, String customerName) {
       this(number, balance, customerName, "default@rfbcu.org", "Phone number not on file");

    }

    public Accounting(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    private String customerPhoneNumber;
}
