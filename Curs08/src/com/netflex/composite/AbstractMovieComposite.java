package com.netflex.composite;

import java.util.List;

public interface AbstractMovieComposite {
    void displayPlaylist();

    void addPlaylistElement(AbstractMovieComposite element);

    void deletePlaylistElement(AbstractMovieComposite element);

    List<AbstractMovieComposite> getPlaylistElements();
}
