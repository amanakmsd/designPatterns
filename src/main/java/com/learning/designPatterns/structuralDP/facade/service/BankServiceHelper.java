package com.learning.designPatterns.structuralDP.facade.service;

public class BankServiceHelper {
    public boolean validatePan(String name, String pan) {
        return true;
    }

    public String createUser(String name) {
        return name;
    }

    public String createAccount(String name, String pan) {
        return name+"-"+pan;
    }

    public boolean addPayment(String accountName, int amount) {
        return true;
    }
}
