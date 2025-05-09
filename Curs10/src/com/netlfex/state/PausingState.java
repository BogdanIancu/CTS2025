package com.netlfex.state;

public class PausingState implements PlayerState{
    @Override
    public void action() {
        System.out.println("PAUSE");
    }
}
