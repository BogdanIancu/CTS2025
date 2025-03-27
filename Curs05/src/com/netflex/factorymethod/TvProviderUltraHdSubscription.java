package com.netflex.factorymethod;

public class TvProviderUltraHdSubscription implements Subscription {
    TvProviderUltraHdSubscription(){
        System.out.println("TV Provider UHD");
    }

    @Override
    public void renderContent() {
        System.out.println("Rendering content in ultra HD format");
    }
}
