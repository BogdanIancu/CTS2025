package com.netflex.factorymethod;

public class NetflexUltraHdSubscription implements Subscription {
    NetflexUltraHdSubscription(){
        System.out.println("Netflex UHD");
    }

    @Override
    public void renderContent() {
        System.out.println("Rendering content in ultra HD format");
    }
}
