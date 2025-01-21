package com.designPatterns.Creational.AbstractFactory.Notification;

public class PushNotificationVendor implements NotificationVendor {
    @Override
    public void notifyUser() {
        System.out.println("Notifying user through push notification");
    }
}
