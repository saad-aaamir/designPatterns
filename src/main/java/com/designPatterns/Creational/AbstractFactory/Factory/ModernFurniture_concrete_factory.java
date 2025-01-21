package com.designPatterns.Creational.AbstractFactory.Factory;

import com.designPatterns.Creational.AbstractFactory.Product.Chair_product;
import com.designPatterns.Creational.AbstractFactory.Product.ModernChair_concrete_product;
import com.designPatterns.Creational.AbstractFactory.Product.ModernTable_concrete_product;
import com.designPatterns.Creational.AbstractFactory.Product.Table_product;

public class ModernFurniture_concrete_factory implements Furniture_factory{
    @Override
    public Chair_product createChair() {
        return new ModernChair_concrete_product();
    }

    @Override
    public Table_product createTable() {
        return new ModernTable_concrete_product();
    }
}
