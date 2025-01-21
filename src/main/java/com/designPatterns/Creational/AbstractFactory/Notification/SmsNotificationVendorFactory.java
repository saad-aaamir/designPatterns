package com.designPatterns.Creational.AbstractFactory.Notification;

public class SmsNotificationVendorFactory implements NotificationVendorFactory {
    @Override
    public NotificationVendor createNotificationVendor() {
        return new SmsNotificationVendor();
    }
}

