package com.netflex.abstractfactory;

public class GreenTelecomSubscriptionFactory implements AbstractSubscriptionFactory{
    @Override
    public Subscription createSubscription() {
        return new FullHdWithAdsSubscription();
    }

    @Override
    public Payment createPayment() {
        return new PhoneSubscriptionPayment();
    }
}
