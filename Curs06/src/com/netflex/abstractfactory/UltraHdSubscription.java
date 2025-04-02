package com.netflex.abstractfactory;

public class UltraHdSubscription implements Subscription {
    @Override
    public void render() {
        System.out.println("Rendering content in Ultra HD");
    }
}
