package com.app.beans;

import java.util.Date;

public class BankAccountTransaction {

    private int accNumber;
    private double amount;
    private Date txDate;
    private String txType;
    private int txId;

    public int getAccNumber() {
        return accNumber;
    }

    public double getAmount() {
        return amount;
    }

    public Date getTxDate() {
        return txDate;
    }

    public String getTxType() {
        return txType;
    }

    public int getTxId() {
        return txId;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    public void setTxType(String txType) {
        this.txType = txType;
    }

    public void setTxId(int txId) {
        this.txId = txId;
    }
}