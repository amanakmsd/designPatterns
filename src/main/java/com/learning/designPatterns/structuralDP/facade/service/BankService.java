package com.learning.designPatterns.structuralDP.facade.service;

public class BankService {

    BankServiceHelper bankServiceHelper;

    public BankService(BankServiceHelper bankServiceHelper) {
        this.bankServiceHelper = bankServiceHelper;
    }

    public void openAccount(String name, String panNumber, int amount) {
        bankServiceHelper.validatePan(name, panNumber);
        bankServiceHelper.createUser(name);
        String accNumber = bankServiceHelper.createAccount(name, panNumber);
        bankServiceHelper.addPayment(accNumber, amount);
    }
}
