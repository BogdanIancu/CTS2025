package com.netflex.prototype;

public class FullHdThumbnail extends AbstractThumbnail {

    public FullHdThumbnail(String movieName, String region) {
        this.movieName = movieName;
        this.region = region;
        System.out.println("...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        image = new byte[]{10, 12, 41};
    }


    @Override
    public void display() {
        System.out.println("Full HD thumbnail for " + movieName +
                " and region " + region);
    }
}
