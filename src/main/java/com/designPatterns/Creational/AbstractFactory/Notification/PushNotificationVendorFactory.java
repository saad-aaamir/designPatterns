package com.designPatterns.Creational.AbstractFactory.Notification;

public class PushNotificationVendorFactory implements NotificationVendorFactory {
    @Override
    public NotificationVendor createNotificationVendor() {
        return new PushNotificationVendor();
    }
}
