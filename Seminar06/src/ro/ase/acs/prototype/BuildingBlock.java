package ro.ase.acs.prototype;

public abstract class BuildingBlock implements Cloneable {
    protected int x;
    protected int y;
    protected int z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        BuildingBlock copy = (BuildingBlock) super.clone();
        copy.x = x;
        copy.y = y;
        copy.z = z;
        return copy;
    }

    public abstract void render();
}
