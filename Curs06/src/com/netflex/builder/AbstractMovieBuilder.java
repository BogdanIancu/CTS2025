package com.netflex.builder;

public interface AbstractMovieBuilder {
    MovieBuilder addTitle(String title);

    MovieBuilder addMinutes(int minutes);

    MovieBuilder addGenre(String genre);

    MovieBuilder addReleaseYear(int releaseYear);

    MovieBuilder addImdbScore(int imdbScore);

    Movie build();
}
