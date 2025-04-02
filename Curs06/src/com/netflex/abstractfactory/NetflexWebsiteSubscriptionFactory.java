package com.netflex.abstractfactory;

public class NetflexWebsiteSubscriptionFactory implements AbstractSubscriptionFactory{
    @Override
    public Subscription createSubscription() {
        return new UltraHdSubscription();
    }

    @Override
    public Payment createPayment() {
        return new OnlineCardPayment();
    }
}
