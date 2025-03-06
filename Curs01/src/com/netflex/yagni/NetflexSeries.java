package com.netflex.yagni;

public class NetflexSeries {
    private String title;
    private double rating;
    private String description;
    //TODO delete this filed, not necessary, no bonus
    private double bonus;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //TODO delete this method, there is no binging bonus
    public double calculateBingingBonus(float numberOfEpisodes) {
        bonus = 0;
        if (numberOfEpisodes < 10) {
            bonus += rating * 0.01;
        } else if (numberOfEpisodes >= 10 && numberOfEpisodes < 20) {
            bonus += rating * 0.05;
        }
        //...
        return bonus;
    }
}
