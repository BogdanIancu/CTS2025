package com.netflex.factorymethod;

public class NetflexFullHdSubscription implements Subscription {
    NetflexFullHdSubscription() {
        System.out.println("Netflex FHD");
    }

    @Override
    public void renderContent() {
        System.out.println("Rendering content in Full HD format");
    }
}
