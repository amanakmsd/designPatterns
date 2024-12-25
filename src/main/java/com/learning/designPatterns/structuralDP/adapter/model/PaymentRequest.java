package com.learning.designPatterns.structuralDP.adapter.model;

public class PaymentRequest {
    private String email;
    private int amount;
    private int transactionId;

    public PaymentRequest(String email, int amount, int transactionId) {
        this.email = email;
        this.amount = amount;
        this.transactionId = transactionId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
}
