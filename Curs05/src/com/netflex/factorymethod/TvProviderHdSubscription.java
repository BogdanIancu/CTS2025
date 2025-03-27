package com.netflex.factorymethod;

public class TvProviderHdSubscription implements Subscription {
    TvProviderHdSubscription() {
        System.out.println("TV Provider HD");
    }

    @Override
    public void renderContent() {
        System.out.println("Rendering content in HD format");
    }
}
