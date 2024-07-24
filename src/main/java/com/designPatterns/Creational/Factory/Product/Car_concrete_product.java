package com.designPatterns.Creational.Factory.Product;

public class Car_concrete_product implements Vehicle_product{
    @Override
    public void start() {
        System.out.print("Car is starting" + "\n");
    }

    @Override
    public void accelerate() {
        System.out.print("Car is accelerating"+ "\n");
    }

    @Override
    public void stop() {
        System.out.print("Car is stopping"+ "\n");
    }
}
