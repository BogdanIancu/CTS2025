package com.netflex.classes;

import com.netflex.solid.contracts.UserContract;

public class PushNotificationService implements PushNotificationServiceContract {
    @Override
    public void sendNotification(UserContract user) {
        System.out.println("Congrats " + user.getEmail() + " for your new subscription");
    }
}
