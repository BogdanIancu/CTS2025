package com.netflex.abstractfactory;

public interface AbstractSubscriptionFactory {
    Subscription createSubscription();

    Payment createPayment();
}
