package com.learning.designPatterns.behaviouralDP.observer.controller;

import com.learning.designPatterns.behaviouralDP.observer.publisher.Publisher;
import com.learning.designPatterns.behaviouralDP.observer.subscriber.DesktopAppObserver;
import com.learning.designPatterns.behaviouralDP.observer.subscriber.MobileAppObserver;

import java.util.List;

public class Controller {

    public static void main(String[] args) {

        Publisher publisher = new Publisher(List.of(new DesktopAppObserver(), new MobileAppObserver()));
        publisher.setWeather("100C");
        publisher.setWeather("1000C");
    }
}
