package com.learning.designPatterns.behaviouralDP.strategy.strategy;

public class PaypalPaymentStrategy implements PaymentStrategy {

    String email;

    public PaypalPaymentStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " Paid via Paypal "+ this.email);
    }
}
