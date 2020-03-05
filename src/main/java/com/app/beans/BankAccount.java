package com.app.beans;

public class BankAccount {

    private int accNumber;
    private String name;
    private String email;
    private String accType;

    public int getAccNumber() {
        return accNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }
}
