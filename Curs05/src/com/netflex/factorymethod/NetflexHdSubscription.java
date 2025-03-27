package com.netflex.factorymethod;

public class NetflexHdSubscription implements Subscription {
    NetflexHdSubscription() {
        System.out.println("Netflex HD");
    }

    @Override
    public void renderContent() {
        System.out.println("Rendering content in HD format");
    }
}
