package com.netflex.solid.services;

import com.netflex.solid.contracts.NotificationService;
import com.netflex.solid.contracts.UserContract;

public class PushNotificationService implements NotificationService {
    @Override
    public void sendNotification(UserContract user) {
        System.out.println("Congrats " + user.getEmail() + " for your new subscription");
    }
}
