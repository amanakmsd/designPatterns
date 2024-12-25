package com.learning.designPatterns.behaviouralDP.strategy.strategy;

@FunctionalInterface
public interface PaymentStrategy {
    void pay(int amount);
}
