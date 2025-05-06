package com.netflex.decorator;

import java.util.List;

public class LiveVideo extends VideoDecorator {
    private List<String> countries = List.of("USA", "France", "UK");

    public LiveVideo(Playable playable) {
        super(playable);
    }

    public List<String> getCountriesWhereAvailable() {
        return List.copyOf(countries);
    }

    @Override
    public void pause() {
        throw new UnsupportedOperationException();
    }
}
