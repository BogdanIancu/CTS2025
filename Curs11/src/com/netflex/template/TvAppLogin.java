package com.netflex.template;

import java.util.List;

public class TvAppLogin extends NetflexLogin {
    @Override
    protected void getUserSubscription() {
        System.out.println("Get subscription from server");
    }

    @Override
    protected List<String> getFamilyMembers() {
        return List.of("John", "Maria", "George");
    }

    @Override
    protected List<String> getFavouriteTitles() {
        return List.of("Titanic", "Inception");
    }
}
