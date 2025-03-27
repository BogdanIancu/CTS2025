package com.netflex.simplefactory;

public class SubscriptionFactory {

    public static final String HD = "HD";
    public static final String FHD = "FHD";
    public static final String UHD = "UHD";

    public Subscription getSubscription(String type) {
        if(HD.equals(type)) {
            return new HdSubscription();
        } else if (FHD.equals(type)) {
            return new FullHdSubscription();
        } else if (UHD.equals(type)) {
            return new UltraHdSubscription();
        }
        return null;
    }
}
