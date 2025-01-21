package com.designPatterns.Creational.AbstractFactory.Notification;

public class EmailNotificationVendorFactory implements NotificationVendorFactory {
    @Override
    public NotificationVendor createNotificationVendor() {
        return new EmailNotificationVendor();
    }
}
