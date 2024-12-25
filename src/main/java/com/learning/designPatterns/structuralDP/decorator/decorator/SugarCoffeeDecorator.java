package com.learning.designPatterns.structuralDP.decorator.decorator;

public class SugarCoffeeDecorator extends CoffeeDecorator {

    public SugarCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", sugar";
    }

    @Override
    public int getCost() {
        return super.getCost() + 2;
    }
}
