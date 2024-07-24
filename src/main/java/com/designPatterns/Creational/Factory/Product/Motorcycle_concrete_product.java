package com.designPatterns.Creational.Factory.Product;

public class Motorcycle_concrete_product implements Vehicle_product{
    @Override
    public void start() {
        System.out.print("Motorcycle is starting"+ "\n");
    }

    @Override
    public void accelerate() {
        System.out.print("Motorcycle is accelerating"+ "\n");
    }

    @Override
    public void stop() {
        System.out.print("Motorcycle is stopping"+ "\n");
    }
}
