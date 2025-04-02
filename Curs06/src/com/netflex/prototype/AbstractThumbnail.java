package com.netflex.prototype;

public abstract class AbstractThumbnail implements Cloneable {
    protected String movieName;
    protected byte[] image;
    protected String region;

    public String getMovieName() {
        return movieName;
    }

    public byte[] getImage() {
        return image.clone();
    }

    public String getRegion() {
        return region;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        AbstractThumbnail copy = (AbstractThumbnail) super.clone();
        copy.movieName = movieName;
        copy.image = this.image.clone();
        copy.region = this.region;
        return copy;
    }

    public abstract void display();
}
