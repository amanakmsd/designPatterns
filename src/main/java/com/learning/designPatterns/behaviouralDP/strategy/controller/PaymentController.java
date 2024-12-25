package com.learning.designPatterns.behaviouralDP.strategy.controller;

import com.learning.designPatterns.behaviouralDP.strategy.strategy.CreditCardPaymentStrategy;
import com.learning.designPatterns.behaviouralDP.strategy.service.PaymentService;
import com.learning.designPatterns.behaviouralDP.strategy.strategy.PaypalPaymentStrategy;

public class PaymentController {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new CreditCardPaymentStrategy("1234-5678-9012"));
        paymentService.pay(100);

        PaymentService paymentService2 = new PaymentService(new PaypalPaymentStrategy("amanakmsd@gmail.com"));
        paymentService2.pay(1000);
    }
}
