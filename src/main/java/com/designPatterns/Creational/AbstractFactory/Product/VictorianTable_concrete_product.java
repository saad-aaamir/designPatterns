package com.designPatterns.Creational.AbstractFactory.Product;

public class VictorianTable_concrete_product implements Table_product{
    @Override
    public void dineOn() {
        System.out.print("Dining on victorian table\n");
    }
}
