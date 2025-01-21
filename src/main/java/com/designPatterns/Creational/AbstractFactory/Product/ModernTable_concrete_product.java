package com.designPatterns.Creational.AbstractFactory.Product;

public class ModernTable_concrete_product implements Table_product{
    @Override
    public void dineOn() {
        System.out.print("Dining on modern table\n");
    }
}
