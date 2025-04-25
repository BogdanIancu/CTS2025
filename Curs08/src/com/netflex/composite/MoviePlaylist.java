package com.netflex.composite;

import java.util.ArrayList;
import java.util.List;

public class MoviePlaylist implements AbstractMovieComposite {
    private List<AbstractMovieComposite> elements = new ArrayList<>();

    @Override
    public void displayPlaylist() {
        for (AbstractMovieComposite e : elements) {
            e.displayPlaylist();
        }
    }

    @Override
    public void addPlaylistElement(AbstractMovieComposite element) {
        elements.add(element);
    }

    @Override
    public void deletePlaylistElement(AbstractMovieComposite element) {
        elements.remove(element);
    }

    @Override
    public List<AbstractMovieComposite> getPlaylistElements() {
        return elements;
    }
}
