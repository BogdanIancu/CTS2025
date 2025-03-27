package com.netflex.simplefactory;

public class SubscriptionFactoryVersion2 {
    public Subscription getSubscription(SubscriptionType type) {
        switch (type) {
            case HIGH_DEFINITION -> {
                return new HdSubscription();
            }
            case FULL_HD -> {
                return new FullHdSubscription();
            }
            case ULTRA_HD -> {
                return new UltraHdSubscription();
            }
            default -> throw new IllegalArgumentException();
        }
    }
}
