package com.learning.designPatterns.structuralDP.adapter.repository;

import com.learning.designPatterns.structuralDP.adapter.model.PaymentRequest;

public interface PaymentRepository {
    public void pay(PaymentRequest paymentRequest);
}
