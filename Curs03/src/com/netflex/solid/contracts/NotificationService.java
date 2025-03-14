package com.netflex.solid.contracts;

public interface NotificationService {
    /**
     * sends a notification
     * @param user the current
     */
    void sendNotification(UserContract user);
}
