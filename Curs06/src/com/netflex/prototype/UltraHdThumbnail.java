package com.netflex.prototype;

public class UltraHdThumbnail extends AbstractThumbnail {
    private int compressionRate;

    public UltraHdThumbnail(String movieName, String region) {
        this.movieName = movieName;
        this.region = region;
        System.out.println("...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        image = new byte[]{100, 122, 40};
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        UltraHdThumbnail copy = (UltraHdThumbnail) super.clone();
        copy.compressionRate = compressionRate;
        return copy;
    }

    @Override
    public void display() {
        System.out.println("Ultra HD thumbnail for " + movieName +
                " and region " + region);
    }
}
