package com.netflex.solid.services;

import com.netflex.solid.contracts.UserContract;

public class PlatformSubscriptionService implements com.netflex.solid.contracts.SubscriptionService {

    @Override
    public void subscribe(UserContract user, String plan) {
        user.setPlan(plan);
        System.out.println(user.getName() + " subscribed to the " + plan + " plan.");
    }
}
