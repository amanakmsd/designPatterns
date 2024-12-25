package com.learning.designPatterns.creationalDP.abstractFactory.controller;

import com.learning.designPatterns.creationalDP.abstractFactory.client.Client;
import com.learning.designPatterns.creationalDP.abstractFactory.factory.impl.Vendor1Factory;
import com.learning.designPatterns.creationalDP.abstractFactory.factory.impl.Vendor2Factory;

public class Controller {
    public static void main(String[] args) {
        Client client1 = new Client(new Vendor1Factory());
        client1.send("Jello");

        Client client2 = new Client(new Vendor2Factory());
        client2.send("Jello");
    }
}
