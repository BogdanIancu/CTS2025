package ro.ase.acs.solid.classes;

import ro.ase.acs.solid.interfaces.ValuePrinter;

public class ConsolePrinter implements ValuePrinter {
    @Override
    public void printResult(double result) {
        System.out.println("Result = " + result);
    }
}
