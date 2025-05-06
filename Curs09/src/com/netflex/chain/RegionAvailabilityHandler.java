package com.netflex.chain;

public class RegionAvailabilityHandler extends VideoHandler {
    private String region;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean canBePlayed(Video video) {
        if (!video.availableInCountries.contains(region)) {
            if (nextHandler != null) {
                return nextHandler.canBePlayed(video);
            }
        }
        return true;
    }
}
