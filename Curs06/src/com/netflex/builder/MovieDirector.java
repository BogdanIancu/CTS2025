package com.netflex.builder;

public class MovieDirector {
    private AbstractMovieBuilder builder;

    public Movie create(String title, int minutes) {
        builder = new MovieBuilder();
        builder.addTitle(title).addMinutes(minutes);
        return builder.build();
    }
}
