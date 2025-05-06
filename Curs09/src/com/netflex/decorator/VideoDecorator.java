package com.netflex.decorator;

public abstract class VideoDecorator implements Playable {
    private Playable playable;

    public VideoDecorator(Playable playable) {
        this.playable = playable;
    }

    @Override
    public void play() {
        playable.play();
    }

    @Override
    public void pause() {
        playable.pause();
    }

    @Override
    public void stop() {
        playable.stop();
    }
}
