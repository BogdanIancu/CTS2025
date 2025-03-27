package ro.ase.acs.factorymethod.contracts;

public abstract class AbstractDocument implements Document {
    protected String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
