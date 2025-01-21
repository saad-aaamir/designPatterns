package com.designPatterns.Creational.AbstractFactory.Factory;

import com.designPatterns.Creational.AbstractFactory.Product.Chair_product;
import com.designPatterns.Creational.AbstractFactory.Product.Table_product;
import com.designPatterns.Creational.AbstractFactory.Product.VictorianChair_concrete_product;
import com.designPatterns.Creational.AbstractFactory.Product.VictorianTable_concrete_product;

public class VictorianFurniture_concrete_factory implements Furniture_factory{
    @Override
    public Chair_product createChair() {
        return new VictorianChair_concrete_product();
    }

    @Override
    public Table_product createTable() {
        return new VictorianTable_concrete_product();
    }
}
