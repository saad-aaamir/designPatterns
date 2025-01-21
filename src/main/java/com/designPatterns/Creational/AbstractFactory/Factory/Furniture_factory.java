package com.designPatterns.Creational.AbstractFactory.Factory;

import com.designPatterns.Creational.AbstractFactory.Product.Chair_product;
import com.designPatterns.Creational.AbstractFactory.Product.Table_product;

public interface Furniture_factory {

    Chair_product createChair();

    Table_product createTable();

}
