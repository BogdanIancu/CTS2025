package com.netflex.template;

import java.util.List;

public abstract class NetflexLogin {
    protected abstract void getUserSubscription();

    protected abstract List<String> getFamilyMembers();

    protected abstract List<String> getFavouriteTitles();

    public final void loadAccountDetails() {
        getUserSubscription();
        System.out.println(getFamilyMembers());
        System.out.println(getFavouriteTitles());
    }
}
