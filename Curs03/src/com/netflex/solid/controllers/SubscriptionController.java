package com.netflex.solid.controllers;

import com.netflex.dip.ServiceLocator;
import com.netflex.solid.contracts.InvoiceService;
import com.netflex.solid.contracts.NotificationService;
import com.netflex.solid.contracts.SubscriptionService;
import com.netflex.solid.contracts.UserContract;
import com.netflex.solid.models.User;

public class SubscriptionController {
    private final UserContract user;
    private final SubscriptionService subscriptionService;
    private final InvoiceService invoiceService;
    private NotificationService notificationService;

    public SubscriptionController(ServiceLocator serviceLocator) {
        user = (UserContract) serviceLocator.resolve(UserContract.class);
        user.setName("Test User");
        user.setEmail("test@test.com");
        user.setPlan("Premium");
        subscriptionService = (SubscriptionService) serviceLocator.resolve(SubscriptionService.class);
        invoiceService = (InvoiceService) serviceLocator.resolve(InvoiceService.class);
        notificationService = (NotificationService) serviceLocator.resolve(NotificationService.class);
    }

    public SubscriptionController(UserContract user,
                                  SubscriptionService subscriptionService,
                                  InvoiceService invoiceService) {
        this.user = user;
        this.subscriptionService = subscriptionService;
        this.invoiceService = invoiceService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void createNewSubscription() {
        subscriptionService.subscribe(user, "Premium");
        invoiceService.generateInvoice(user);
        notificationService.sendNotification(user);
    }
}
