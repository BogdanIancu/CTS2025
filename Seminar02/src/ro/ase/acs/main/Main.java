package ro.ase.acs.main;

import ro.ase.acs.solid.AverageCalculator;
import ro.ase.acs.solid.ConsolePrinter;
import ro.ase.acs.solid.ConsoleReader;

public class Main {
    public static void main(String[] args) {
       Orchestrator orchestrator = new Orchestrator(new AverageCalculator(), new ConsoleReader(), new ConsolePrinter());
       orchestrator.execute();
    }
}
