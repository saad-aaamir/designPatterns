package com.designPatterns.Creational.Factory.Product;

public class Truck_concrete_product implements Vehicle_product{
    @Override
    public void start() {
        System.out.print("Truck is starting"+ "\n");
    }

    @Override
    public void accelerate() {
        System.out.print("Truck is accelerating"+ "\n");
    }

    @Override
    public void stop() {
        System.out.print("Truck is stopping"+ "\n");
    }
}
