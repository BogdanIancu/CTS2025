package com.netflex.abstractfactory;

public class User {
    Subscription subscription;
    Payment payment;

    public User(AbstractSubscriptionFactory factory) {
        if (factory != null) {
            subscription = factory.createSubscription();
            payment = factory.createPayment();
        }
    }

    public void getDetails() {
        subscription.render();
        System.out.println("Price: " + payment.getPrice());
    }
}
