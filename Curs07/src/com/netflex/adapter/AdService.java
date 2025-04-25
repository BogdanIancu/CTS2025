package com.netflex.adapter;

public class AdService implements AbstractAdService {
    private String adProvider;

    public String getAdProvider() {
        return adProvider;
    }

    public void setAdProvider(String adProvider) {
        this.adProvider = adProvider;
    }

    @Override
    public void displayAd(int seconds) {
        System.out.println("Ad for " + seconds + " seconds >>>");
    }
}
