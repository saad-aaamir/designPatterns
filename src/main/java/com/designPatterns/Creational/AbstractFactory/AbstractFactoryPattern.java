package com.designPatterns.Creational.AbstractFactory;

import com.designPatterns.Creational.AbstractFactory.Notification.NotificationVendor;
import com.designPatterns.Creational.AbstractFactory.Notification.NotificationVendorFactory;
import com.designPatterns.Creational.AbstractFactory.Notification.NotificationFactoryProducer;

public class AbstractFactoryPattern {

    public AbstractFactoryPattern() {
        System.out.print("----------------Abstract Factory pattern start----------------\n");
        run();
        System.out.print("-----------------Abstract Factory pattern end-----------------\n");
    }

    public void run() {
        NotificationVendorFactory smsFactory = NotificationFactoryProducer.getFactory("SMS");
        NotificationVendor smsVendor = smsFactory.createNotificationVendor();
        smsVendor.notifyUser();

        NotificationVendorFactory emailFactory = NotificationFactoryProducer.getFactory("EMAIL");
        NotificationVendor emailVendor = emailFactory.createNotificationVendor();
        emailVendor.notifyUser();

        NotificationVendorFactory pushFactory = NotificationFactoryProducer.getFactory("PUSH");
        NotificationVendor pushVendor = pushFactory.createNotificationVendor();
        pushVendor.notifyUser();
    }
//    public void run() {
//        Furniture_factory factory;
//
//        String style = "victorean";
//        if ("modern".equals(style)) {
//            factory = new ModernFurniture_concrete_factory();
//        } else {
//            factory = new VictorianFurniture_concrete_factory();
//        }
//
//        FurnitureStore store = new FurnitureStore(factory);
//        store.furnish();
//    }
}
