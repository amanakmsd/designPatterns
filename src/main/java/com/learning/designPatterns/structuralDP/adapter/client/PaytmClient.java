package com.learning.designPatterns.structuralDP.adapter.client;

import com.learning.designPatterns.structuralDP.adapter.model.PaytmPaymentRequestDTO;

public class PaytmClient {
    public void callPaytm(PaytmPaymentRequestDTO paytmPaymentRequestDTO) {
        System.out.println("Hello "+ paytmPaymentRequestDTO.getUsername() );

    }
}
