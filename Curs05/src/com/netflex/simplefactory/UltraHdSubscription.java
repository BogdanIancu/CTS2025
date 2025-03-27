package com.netflex.simplefactory;

public class UltraHdSubscription implements Subscription {
    UltraHdSubscription(){

    }

    @Override
    public void renderContent() {
        System.out.println("Rendering content in ultra HD format");
    }
}
