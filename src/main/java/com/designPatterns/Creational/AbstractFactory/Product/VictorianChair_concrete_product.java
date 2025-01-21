package com.designPatterns.Creational.AbstractFactory.Product;

public class VictorianChair_concrete_product implements Chair_product{
    @Override
    public void sitOn() {
        System.out.print("Sitting on victorian chair\n");
    }
}
