package com.designPatterns;

import com.designPatterns.Creational.AbstractFactory.AbstractFactoryPattern;
import com.designPatterns.Creational.Factory.FactoryPattern;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {
        new FactoryPattern();
        new AbstractFactoryPattern();

    }
}

