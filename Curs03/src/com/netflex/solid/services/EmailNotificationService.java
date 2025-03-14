package com.netflex.solid.services;

import com.netflex.solid.contracts.NotificationService;
import com.netflex.solid.contracts.UserContract;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(UserContract user) {
        System.out.println("Email sent to " + user.getEmail() + " for the " + user.getPlan() + " subscription.");
    }
}
