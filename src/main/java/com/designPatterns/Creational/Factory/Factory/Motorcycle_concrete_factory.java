package com.designPatterns.Creational.Factory.Factory;

import com.designPatterns.Creational.Factory.Product.Motorcycle_concrete_product;
import com.designPatterns.Creational.Factory.Product.Vehicle_product;

public class Motorcycle_concrete_factory extends Vehicle_factory {
    @Override
    public Vehicle_product createVehicle() {
        return new Motorcycle_concrete_product();
    }
}
