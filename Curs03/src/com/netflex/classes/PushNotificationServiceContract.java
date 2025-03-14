package com.netflex.classes;

import com.netflex.solid.contracts.UserContract;

public interface PushNotificationServiceContract {
    /**
     * sends a notification
     * @param user the current
     */
    void sendNotification(UserContract user);
}
