package com.netflex.decorator;

import java.time.LocalDate;

public class TemporaryVideo extends VideoDecorator {
    private LocalDate availableUntil;

    public TemporaryVideo(Playable playable) {
        super(playable);
    }

    public LocalDate getAvailableUntil() {
        return availableUntil;
    }

    public void setAvailableUntil(LocalDate availableUntil) {
        this.availableUntil = availableUntil;
    }
}
