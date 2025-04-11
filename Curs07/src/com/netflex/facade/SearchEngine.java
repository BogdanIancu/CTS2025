package com.netflex.facade;

import java.util.List;

public class SearchEngine {
    private String title;
    private String genre;
    private int year;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //...

    public List<String> search() {
        StringBuilder sb = new StringBuilder();
        sb.append("Searching by: ");
        if (title != null) {
            sb.append("title - ").append(title);
        }
        if (genre != null) {
            sb.append("genre - ").append(genre);
        }
        if (year != 0) {
            sb.append("year - ").append(year);
        }
        System.out.println(sb);
        return List.of("Tenet", "Titanic", "Oppenheimer");
    }
}
