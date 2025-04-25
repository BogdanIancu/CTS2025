package com.netflex.adapter;

import java.time.Duration;

public interface AbstractVideoAdService {
    Duration getMaxDuration();

    void setMaxDuration(Duration maxDuration);

    boolean isSkippable();

    void setSkippable(boolean skippable);

    void runAd();
}
