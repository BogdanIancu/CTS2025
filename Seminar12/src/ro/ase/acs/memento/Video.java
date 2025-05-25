package ro.ase.acs.memento;

public class Video implements Cloneable {
    private String title;
    private int length;

    public Video(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Video copy = (Video) super.clone();
        copy.title = title;
        copy.length = length;
        return copy;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", length=" + length +
                '}';
    }
}
