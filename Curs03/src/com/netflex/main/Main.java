package com.netflex.main;

import com.netflex.classes.PushNotificationServiceContract;
import com.netflex.dip.Bean;
import com.netflex.dip.IocContainer;
import com.netflex.dip.ServiceLocator;
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
    @Bean
    private PushNotificationServiceContract pushNotificationService;

    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int min = (x < y) ? x : y;
        System.out.println(min);
        int value = Integer.MAX_VALUE;
        value++;
        System.out.println(value);

        ServiceLocator serviceLocator = new ServiceLocator();
        serviceLocator.register(UserContract.class, User.class);
        serviceLocator.register(InvoiceService.class, PlatformInvoiceService.class);
        serviceLocator.register(NotificationService.class, EmailNotificationService.class);
        serviceLocator.register(SubscriptionService.class, PlatformSubscriptionService.class);

        SubscriptionController controller = new SubscriptionController(serviceLocator);
        controller.createNewSubscription();


        Main program = new Main();
        IocContainer container = new IocContainer();
        container.initialize(program);
        program.pushNotificationService.sendNotification(new User("", "email@gmail.com", "Basic"));
    }
}
