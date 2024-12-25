package com.learning.designPatterns.behaviouralDP.strategy.service;

import com.learning.designPatterns.behaviouralDP.strategy.strategy.PaymentStrategy;

public class PaymentService {

    PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount) {
        paymentStrategy.pay(amount);
    }
}
