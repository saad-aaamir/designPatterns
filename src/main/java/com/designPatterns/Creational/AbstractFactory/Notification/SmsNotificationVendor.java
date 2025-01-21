package com.designPatterns.Creational.AbstractFactory.Notification;

public class SmsNotificationVendor implements NotificationVendor {
    @Override
    public void notifyUser() {
        System.out.println("Notifying user through SMS");
    }
}

