package com.learning.designPatterns.structuralDP.adapter.service;

import com.learning.designPatterns.structuralDP.adapter.repository.PaymentRepository;
import com.learning.designPatterns.structuralDP.adapter.model.PaymentRequest;

public class PaymentService {

    PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public void pay(PaymentRequest paymentRequest) {
        paymentRepository.pay(paymentRequest);
    }
}
