package com.designPatterns.Creational.AbstractFactory.Notification;

public abstract class NotificationFactoryProducer {
    public static NotificationVendorFactory getFactory(String type) {
        return switch (type) {
            case "SMS" -> new SmsNotificationVendorFactory();
            case "EMAIL" -> new EmailNotificationVendorFactory();
            case "PUSH" -> new PushNotificationVendorFactory();
            default -> throw new IllegalArgumentException("unknown type");
        };

    }
}
