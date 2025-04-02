package com.netflex.abstractfactory;

public class FullHdWithAdsSubscription implements Subscription {
    @Override
    public void render() {
        System.out.println("Rendering content in Full HD with ads");
    }
}
