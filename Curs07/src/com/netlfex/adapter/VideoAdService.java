package com.netlfex.adapter;

import java.time.Duration;

public class VideoAdService implements AbstractVideoAdService {
    private Duration maxDuration;
    private boolean isSkippable;

    @Override
    public Duration getMaxDuration() {
        return maxDuration;
    }

    @Override
    public void setMaxDuration(Duration maxDuration) {
        this.maxDuration = maxDuration;
    }

    @Override
    public boolean isSkippable() {
        return isSkippable;
    }

    @Override
    public void setSkippable(boolean skippable) {
        isSkippable = skippable;
    }

    @Override
    public void runAd() {
        System.out.println("Displaying a " +
                (isSkippable ? "skippable" : "non-skippable") +
                " add for " + (maxDuration != null ? maxDuration.toSeconds() : 0) + " seconds");
    }
}
