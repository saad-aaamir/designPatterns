package com.designPatterns.Creational.Factory.Factory;

import com.designPatterns.Creational.Factory.Product.Car_concrete_product;
import com.designPatterns.Creational.Factory.Product.Vehicle_product;

public class Car_concrete_factory extends Vehicle_factory {
    @Override
    public Vehicle_product createVehicle() {
        return new Car_concrete_product();
    }
}
