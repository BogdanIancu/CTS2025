package com.netflex.solid.controllers;

import com.netflex.solid.contracts.InvoiceService;
import com.netflex.solid.contracts.NotificationService;
import com.netflex.solid.contracts.SubscriptionService;
import com.netflex.solid.contracts.UserContract;

public class SubscriptionController {
    private UserContract user;
    private SubscriptionService subscriptionService;
    private InvoiceService invoiceService;
    private NotificationService notificationService;

    public SubscriptionController(UserContract user, SubscriptionService subscriptionService, InvoiceService invoiceService, NotificationService notificationService) {
        this.user = user;
        this.subscriptionService = subscriptionService;
        this.invoiceService = invoiceService;
        this.notificationService = notificationService;
    }

    public void createNewSubscription() {
        subscriptionService.subscribe(user, "Premium");
        invoiceService.generateInvoice(user);
        notificationService.sendNotification(user);
    }
}
