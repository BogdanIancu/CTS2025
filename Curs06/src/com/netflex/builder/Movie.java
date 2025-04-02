package com.netflex.builder;

public class Movie {
    private String title;
    private int minutes;
    private String genre;
    private int releaseYear;
    private float imdbScore;

    private Movie() {
    }

    Movie(String title, int minutes, String genre, int releaseYear, float imdbScore) {
        this.title = title;
        this.minutes = minutes;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.imdbScore = imdbScore;
    }

    public String getTitle() {
        return title;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public float getImdbScore() {
        return imdbScore;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", minutes=" + minutes +
                ", genre='" + genre + '\'' +
                ", releaseYear=" + releaseYear +
                ", imdbScore=" + imdbScore +
                '}';
    }

    public static class Builder {
        private Movie movie = new Movie();

        public Builder addTitle(String title) {
            movie.title = title;
            return this;
        }

        public Builder addMinutes(int minutes) {
            movie.minutes = minutes;
            return this;
        }

        public Builder addGenre(String genre) {
            movie.genre = genre;
            return this;
        }

        public Builder addReleaseYear(int releaseYear) {
            movie.releaseYear = releaseYear;
            return this;
        }

        public Builder addImdbScore(int imdbScore) {
            movie.imdbScore = imdbScore;
            return this;
        }

        public Movie build() {
            Movie copy = movie;
            movie = new Movie();
            return copy;
        }
    }
}
