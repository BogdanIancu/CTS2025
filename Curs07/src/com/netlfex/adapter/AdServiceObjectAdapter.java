package com.netlfex.adapter;

import java.time.Duration;

public class AdServiceObjectAdapter implements AbstractAdService {
    private AbstractVideoAdService videoAdService;

    public AdServiceObjectAdapter(AbstractVideoAdService videoAdService) {
        this.videoAdService = videoAdService;
    }

    @Override
    public void displayAd(int seconds) {
        if (videoAdService != null) {
            videoAdService.setSkippable(false);
            videoAdService.setMaxDuration(Duration.ofSeconds(seconds));
            videoAdService.runAd();
        }
    }
}
