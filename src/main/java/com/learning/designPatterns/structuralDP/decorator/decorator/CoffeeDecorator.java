package com.learning.designPatterns.structuralDP.decorator.decorator;

public class CoffeeDecorator implements Coffee {
    private final Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription();
    }

    public int getCost() {
        return coffee.getCost();
    }
}
