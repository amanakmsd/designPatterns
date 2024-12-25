package com.learning.designPatterns.creationalDP.abstractFactory.factory;

import com.learning.designPatterns.creationalDP.abstractFactory.vendor.Vendor;

@FunctionalInterface
public interface VendorFactory {
    Vendor generate();
}
