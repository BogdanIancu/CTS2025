package ro.ase.acs.main;

import ro.ase.acs.solid.*;

import java.util.List;

public class Orchestrator {
    private Calculator calculator;
    private ValueReader valueReader;
    private ValuePrinter valuePrinter;

    public Orchestrator(Calculator calculator, ValueReader valueReader, ValuePrinter valuePrinter) {
        this.calculator = calculator;
        this.valueReader = valueReader;
        this.valuePrinter = valuePrinter;
    }

    public void execute(){
        List<Integer> numbers= valueReader.readValues();
        double sum= calculator.computeResult(numbers);
        valuePrinter.printResult(sum);
    }
}
