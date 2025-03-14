package com.netflex.solid;

import com.netflex.solid.contracts.InvoiceService;
import com.netflex.solid.contracts.NotificationService;
import com.netflex.solid.contracts.SubscriptionService;
import com.netflex.solid.contracts.UserContract;
import com.netflex.solid.controllers.SubscriptionController;
import com.netflex.solid.models.User;
import com.netflex.solid.services.EmailNotificationService;
import com.netflex.solid.services.PlatformInvoiceService;
import com.netflex.solid.services.PlatformSubscriptionService;

public class Main {
    public static void main(String[] args) {
        UserContract user = new User("John Doe", "john.doe@gmail.com", "Basic");
        SubscriptionService subscriptionService = new PlatformSubscriptionService();
        InvoiceService invoiceService = new PlatformInvoiceService();
        NotificationService notificationService = new EmailNotificationService();

        // TODO use an IoC Container (see other Main for details)
        SubscriptionController controller = new SubscriptionController(user, subscriptionService, invoiceService);
        controller.setNotificationService(notificationService);
        controller.createNewSubscription();
    }
}
