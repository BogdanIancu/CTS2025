package com.netflex.template;

import java.util.List;

public class MobileAppLogin extends NetflexLogin {
    @Override
    protected void getUserSubscription() {
        System.out.println("UHD subscription");
    }

    @Override
    protected List<String> getFamilyMembers() {
        return List.of("Me", "Kid");
    }

    @Override
    protected List<String> getFavouriteTitles() {
        return List.of("Seinfeld", "Friends");
    }
}
