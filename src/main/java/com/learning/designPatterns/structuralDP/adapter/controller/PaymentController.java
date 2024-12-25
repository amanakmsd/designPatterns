package com.learning.designPatterns.structuralDP.adapter.controller;

import com.learning.designPatterns.structuralDP.adapter.client.PaytmClient;
import com.learning.designPatterns.structuralDP.adapter.model.PaymentRequest;
import com.learning.designPatterns.structuralDP.adapter.repository.PaymentRepositoryImpl;
import com.learning.designPatterns.structuralDP.adapter.service.PaymentService;

public class PaymentController {

    public static void main(String[] args) {
        PaymentRequest paymentRequest = new PaymentRequest("amanakmsd@gmail.com", 100, 1);
        PaymentService paymentService = new PaymentService(new PaymentRepositoryImpl(new PaytmClient()));
        paymentService.pay(paymentRequest);
    }
}
