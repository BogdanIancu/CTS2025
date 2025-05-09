package com.netlfex.state;

public class PlayingState implements PlayerState {
    @Override
    public void action() {
        System.out.println("PLAY");
    }
}
