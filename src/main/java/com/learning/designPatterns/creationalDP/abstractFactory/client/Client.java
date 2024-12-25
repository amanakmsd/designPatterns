package com.learning.designPatterns.creationalDP.abstractFactory.client;

import com.learning.designPatterns.creationalDP.abstractFactory.factory.VendorFactory;
import com.learning.designPatterns.creationalDP.abstractFactory.vendor.Vendor;

public class Client {
    VendorFactory vendorFactory;

    public Client(VendorFactory vendorFactory) {
        this.vendorFactory = vendorFactory;
    }

    public void send(String message) {
        Vendor vendor = vendorFactory.generate();
        vendor.send(message);
    }


}
