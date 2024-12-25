package com.learning.designPatterns.creationalDP.abstractFactory.vendor.impl;

import com.learning.designPatterns.creationalDP.abstractFactory.vendor.Vendor;

public class Vendor2 extends Vendor {

    @Override
    public void send(String message) {
        System.out.println("Vendor 2 : "+message);
    }
}
