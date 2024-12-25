package com.learning.designPatterns.structuralDP.decorator.decorator;

public class MilkCoffeeDecorator extends CoffeeDecorator {

    public MilkCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public int getCost() {
        return super.getCost() + 5;
    }
}
