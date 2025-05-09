package com.netlfex.command;

public class NetflexPlayer implements AbstractPlayer {
    public void play() {
        System.out.println("Netflex: PLAY");
    }

    public void pause() {
        System.out.println("Netflex: PAUSE");
    }

    public void stop() {
        System.out.println("Netflex: STOP");
    }
}
