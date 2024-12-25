package com.learning.designPatterns.structuralDP.proxy.service;

import com.learning.designPatterns.structuralDP.proxy.repository.EventDBImpl;
import com.learning.designPatterns.structuralDP.proxy.repository.EventProxy;

public class EventService {

    public static void main(String[] args) {
        EventProxy eventProxy = new EventProxy(new EventDBImpl());
        System.out.println(eventProxy.get(1));
        System.out.println(eventProxy.get(2));
        System.out.println(eventProxy.get(1));

    }
}
