package com.designPatterns;

import com.designPatterns.Creational.Factory.FactoryPattern;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {

        /*----------------FactoryPattern Run----------------*/
        FactoryPattern factoryPattern = new FactoryPattern();
        factoryPattern.run();
        /*----------------FactoryPattern End----------------*/

    }

}
