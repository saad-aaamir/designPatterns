package com.designPatterns.Creational.Factory.Product;

public class QuadBike_concrete_product implements Vehicle_product{
    @Override
    public void start() {
        System.out.print("QuadBike is starting"+ "\n");
    }

    @Override
    public void accelerate() {
        System.out.print("QuadBike is accelerating"+ "\n");
    }

    @Override
    public void stop() {
        System.out.print("QuadBike is stopping"+ "\n");
    }
}
