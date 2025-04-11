package com.netlfex.adapter;

import java.time.Duration;

public class AdServiceClassAdapter extends VideoAdService implements AbstractAdService{
    @Override
    public void displayAd(int seconds) {
        this.setSkippable(false);
        this.setMaxDuration(Duration.ofSeconds(seconds));
        this.runAd();
    }
}
