package com.learning.designPatterns.behaviouralDP.observer.publisher;

import com.learning.designPatterns.behaviouralDP.observer.subscriber.Observer;

import java.util.List;

public class Publisher {
    private List<Observer> observers;
    String weather;

    public Publisher(List<Observer> observers) {
        this.observers = observers;
    }


    public void setWeather(String weather) {
        this.weather = weather;
        for(Observer observer : observers) {
            observer.update(weather);
        }
    }
}
