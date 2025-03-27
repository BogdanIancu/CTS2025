package com.netflex.factorymethod;

public interface AbstractSubscriptionFactory {
    String HD = "HD";
    String FHD = "FHD";
    String UHD = "UHD";

    Subscription getSubscription(String type);
}
