package com.netflex.builder;

public class MovieBuilder implements AbstractMovieBuilder {
    private String title;
    private int minutes;
    private String genre;
    private int releaseYear;
    private float imdbScore;

    @Override
    public MovieBuilder addTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public MovieBuilder addMinutes(int minutes) {
        this.minutes = minutes;
        return this;
    }

    @Override
    public MovieBuilder addGenre(String genre) {
        this.genre = genre;
        return this;
    }

    @Override
    public MovieBuilder addReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
        return this;
    }

    @Override
    public MovieBuilder addImdbScore(int imdbScore) {
        this.imdbScore = imdbScore;
        return this;
    }

    @Override
    public Movie build() {
        return new Movie(title, minutes, genre, releaseYear, imdbScore);
    }
}
