package com.netlfex.observer;

public class User implements Observer {
    private String name;
    //...

    @Override
    public void receiveNotification(String message) {
        System.out.println(message);
    }
}
