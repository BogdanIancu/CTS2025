package com.netflex.factorymethod;

public class TvProviderFullHdSubscription implements Subscription {
    TvProviderFullHdSubscription() {
        System.out.println("TV Provider FHD");
    }

    @Override
    public void renderContent() {
        System.out.println("Rendering content in Full HD format");
    }
}
