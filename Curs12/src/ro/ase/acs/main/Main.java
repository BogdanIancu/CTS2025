package ro.ase.acs.main;

import ro.ase.acs.classes.Operations;

public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();
        double result = operations.sum(1, 2);
        System.out.println(result);
    }
}
