package com.learning.designPatterns.behaviouralDP.observer.subscriber;

@FunctionalInterface
public interface Observer {
    void update(String weather);
}
