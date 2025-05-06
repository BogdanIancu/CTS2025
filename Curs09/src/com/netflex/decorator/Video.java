package com.netflex.decorator;

public class Video implements Playable {
    private String name;

    public Video() {
    }

    public Video(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Playing " + name + "...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + name + "...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping " + name + "...");
    }
}
