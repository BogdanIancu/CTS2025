package ro.ase.acs.main;

import ro.ase.acs.solid.ServiceLocator;
import ro.ase.acs.solid.exceptions.NullListException;
import ro.ase.acs.solid.interfaces.Calculator;
import ro.ase.acs.solid.interfaces.ValuePrinter;
import ro.ase.acs.solid.interfaces.ValueReader;

import java.util.List;

public class Orchestrator {
    private final ValueReader reader;
    private Calculator calculator;
    private final ValuePrinter printer;

    public Orchestrator(ServiceLocator serviceLocator) {
        reader = (ValueReader) serviceLocator.resolve("ValueReader");
        printer = (ValuePrinter) serviceLocator.resolve("ValuePrinter");
        calculator = (Calculator) serviceLocator.resolve("Calculator");
    }

    public Orchestrator(ValueReader reader, ValuePrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }

    public Orchestrator(ValueReader reader, Calculator calculator, ValuePrinter printer) {
        this.reader = reader;
        this.calculator = calculator;
        this.printer = printer;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void execute() {
        List<Integer> values = reader.readValues();
        double result = 0;
        try {
            result = calculator.computeResult(values);
        } catch (NullListException e) {
            e.printStackTrace();
        }
        printer.printResult(result);
    }
}
