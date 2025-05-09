package com.netlfex.strategy;

public class Player {
    private String videoName;
    private CompressionStragegy strategy;

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public void setStrategy(CompressionStragegy strategy) {
        this.strategy = strategy;
    }

    public void play() {
        if (strategy != null) {
            strategy.compress();
            System.out.println("Playing...");
        } else {
            throw new StrategyNotSetException();
        }
    }
}
