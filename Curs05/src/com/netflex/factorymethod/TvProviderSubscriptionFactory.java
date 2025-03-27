package com.netflex.factorymethod;

public class TvProviderSubscriptionFactory implements AbstractSubscriptionFactory {

    @Override
    public Subscription getSubscription(String type) {
        if(HD.equals(type)) {
            return new TvProviderHdSubscription();
        } else if (FHD.equals(type)) {
            return new TvProviderFullHdSubscription();
        } else if (UHD.equals(type)) {
            return new TvProviderUltraHdSubscription();
        }
        return null;
    }
}
