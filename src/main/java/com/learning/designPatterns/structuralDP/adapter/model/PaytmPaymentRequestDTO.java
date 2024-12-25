package com.learning.designPatterns.structuralDP.adapter.model;

public class PaytmPaymentRequestDTO {
    int amount;
    int apiKey;
    String username;

    public PaytmPaymentRequestDTO(int amount, int apiKey, String username) {
        this.amount = amount;
        this.apiKey = apiKey;
        this.username = username;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getApiKey() {
        return apiKey;
    }

    public void setApiKey(int apiKey) {
        this.apiKey = apiKey;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
