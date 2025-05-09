package com.netlfex.command;

public class YoutubePlayer implements AbstractPlayer {
    @Override
    public void play() {
        System.out.println("Youtube: PLAY");
    }

    @Override
    public void pause() {
        System.out.println("Youtube: PAUSE");
    }

    @Override
    public void stop() {
        System.out.println("Youtube: STOP");
    }
}
