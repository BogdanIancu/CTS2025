package com.netflex.simplefactory;

public class FullHdSubscription implements Subscription {
    FullHdSubscription() {
    }

    @Override
    public void renderContent() {
        System.out.println("Rendering content in Full HD format");
    }
}
