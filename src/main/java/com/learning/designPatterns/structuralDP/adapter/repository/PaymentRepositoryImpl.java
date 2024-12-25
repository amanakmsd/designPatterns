package com.learning.designPatterns.structuralDP.adapter.repository;

import com.learning.designPatterns.structuralDP.adapter.client.PaytmClient;
import com.learning.designPatterns.structuralDP.adapter.model.PaymentRequest;
import com.learning.designPatterns.structuralDP.adapter.model.PaytmPaymentRequestDTO;

public class PaymentRepositoryImpl implements PaymentRepository {

    PaytmClient paytmClient;

    public PaymentRepositoryImpl(PaytmClient paytmClient) {
        this.paytmClient = paytmClient;
    }

    @Override
    public void pay(PaymentRequest paymentRequest) {
        PaytmPaymentRequestDTO paytmPaymentRequestDTO = new PaytmPaymentRequestDTO(paymentRequest.getAmount(), 123, paymentRequest.getEmail());
        paytmClient.callPaytm(paytmPaymentRequestDTO);
    }


}
