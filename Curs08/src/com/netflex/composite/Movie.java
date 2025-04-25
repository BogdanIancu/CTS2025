package com.netflex.composite;

import java.util.List;

public class Movie implements AbstractMovieComposite {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    @Override
    public void displayPlaylist() {
        System.out.println(name);
    }

    @Override
    public void addPlaylistElement(AbstractMovieComposite element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deletePlaylistElement(AbstractMovieComposite element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<AbstractMovieComposite> getPlaylistElements() {
        throw new UnsupportedOperationException();
    }
}
