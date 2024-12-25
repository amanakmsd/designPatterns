package com.learning.designPatterns.structuralDP.decorator.controller;

import com.learning.designPatterns.structuralDP.decorator.decorator.MilkCoffeeDecorator;
import com.learning.designPatterns.structuralDP.decorator.decorator.Coffee;
import com.learning.designPatterns.structuralDP.decorator.decorator.SimpleCoffee;
import com.learning.designPatterns.structuralDP.decorator.decorator.SugarCoffeeDecorator;

public class Controller {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getCost() + " " + coffee.getDescription());
        coffee = new MilkCoffeeDecorator(coffee);
        System.out.println(coffee.getCost() + " " + coffee.getDescription());
        coffee = new SugarCoffeeDecorator(coffee);
        System.out.println(coffee.getCost() + " " + coffee.getDescription());

    }
}
