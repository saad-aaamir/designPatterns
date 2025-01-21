package com.designPatterns.Creational.Factory;

import com.designPatterns.Creational.Factory.Factory.*;
import com.designPatterns.Creational.Factory.Product.Vehicle_product;

public class FactoryPattern {
    public FactoryPattern(){
        System.out.print("----------------Factory pattern start----------------\n");
        run();
        System.out.print("----------------Factory pattern end----------------\n");
    }

    public void run() {

        Vehicle_factory factory;
        Vehicle_product vehicleProduct;

        // Creating a Car
        factory = new Car_concrete_factory();
        vehicleProduct = factory.createVehicle();
        vehicleProduct.start();
        vehicleProduct.accelerate();
        vehicleProduct.stop();

        // Creating a Truck
        factory = new Truck_concrete_factory();
        vehicleProduct = factory.createVehicle();
        vehicleProduct.start();
        vehicleProduct.accelerate();
        vehicleProduct.stop();


        // Creating a Motorcycle
        factory = new Motorcycle_concrete_factory();
        vehicleProduct = factory.createVehicle();
        vehicleProduct.start();
        vehicleProduct.accelerate();
        vehicleProduct.stop();

        // Creating a QuadBike
        factory = new QuadBike_concrete_factory();
        vehicleProduct = factory.createVehicle();
        vehicleProduct.start();
        vehicleProduct.accelerate();
        vehicleProduct.stop();
    }
}
