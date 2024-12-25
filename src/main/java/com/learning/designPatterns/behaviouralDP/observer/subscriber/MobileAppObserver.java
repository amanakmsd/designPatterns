package com.learning.designPatterns.behaviouralDP.observer.subscriber;

public class MobileAppObserver implements Observer {
    @Override
    public void update(String weather) {
        System.out.println(weather + " received for Mobile App");
    }
}
