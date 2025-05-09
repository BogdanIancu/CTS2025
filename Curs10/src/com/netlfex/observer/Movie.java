package com.netlfex.observer;

public class Movie extends Observable {
    private String title;
    private int duration;
    //...


    public Movie(String title) {
        this.title = title;
    }

    public void sendNotification(String notification) {
        notifyObservers(title + ": " + notification);
    }
}
