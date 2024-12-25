package com.learning.designPatterns.creationalDP.abstractFactory.vendor;

public abstract class Vendor {
    private String vendorName;

    public abstract void send(String message);
}
