package com.learning.designPatterns.creationalDP.abstractFactory.factory.impl;

import com.learning.designPatterns.creationalDP.abstractFactory.factory.VendorFactory;
import com.learning.designPatterns.creationalDP.abstractFactory.vendor.Vendor;
import com.learning.designPatterns.creationalDP.abstractFactory.vendor.impl.Vendor1;

public class Vendor1Factory implements VendorFactory {
    @Override
    public Vendor generate() {
        return new Vendor1();
    }
}
