package com.learning.designPatterns.behaviouralDP.strategy.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    String cardNumber;

    public CreditCardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid via credit card : "+this.cardNumber);
    }
}
