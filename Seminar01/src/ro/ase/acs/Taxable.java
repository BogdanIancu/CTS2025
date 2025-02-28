package ro.ase.acs;

public interface Taxable {
    float computeTax();

    default boolean isTaxable() {
        return true;
    }
}
