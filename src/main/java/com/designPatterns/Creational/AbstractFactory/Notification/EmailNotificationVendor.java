package com.designPatterns.Creational.AbstractFactory.Notification;

public class EmailNotificationVendor implements NotificationVendor {
    @Override
    public void notifyUser() {
        System.out.println("Notifying user through Email");
    }
}
