package com.netflex.factorymethod;

public class NetflexSubscriptionFactory implements AbstractSubscriptionFactory {

    @Override
    public Subscription getSubscription(String type) {
        if(HD.equals(type)) {
            return new NetflexHdSubscription();
        } else if (FHD.equals(type)) {
            return new NetflexFullHdSubscription();
        } else if (UHD.equals(type)) {
            return new NetflexUltraHdSubscription();
        }
        return null;
    }
}
