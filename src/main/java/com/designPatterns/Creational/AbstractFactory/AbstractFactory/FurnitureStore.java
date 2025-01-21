package com.designPatterns.Creational.AbstractFactory.AbstractFactory;

import com.designPatterns.Creational.AbstractFactory.Factory.Furniture_factory;
import com.designPatterns.Creational.AbstractFactory.Product.Chair_product;
import com.designPatterns.Creational.AbstractFactory.Product.Table_product;

public class FurnitureStore {
    private Chair_product chair;
    private Table_product table;

    public FurnitureStore(Furniture_factory factory) {
        this.chair = factory.createChair();
        this.table = factory.createTable();
    }

    public void furnish() {
        chair.sitOn();
        table.dineOn();
    }

}
