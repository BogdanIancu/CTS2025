package com.netflex.simplefactory;

public class HdSubscription implements Subscription {
    HdSubscription() {
    }

    @Override
    public void renderContent() {
        System.out.println("Rendering content in HD format");
    }
}
