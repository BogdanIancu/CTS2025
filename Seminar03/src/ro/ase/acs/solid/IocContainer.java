package ro.ase.acs.solid;

import ro.ase.acs.main.Orchestrator;
import ro.ase.acs.solid.interfaces.Calculator;
import ro.ase.acs.solid.interfaces.ValuePrinter;
import ro.ase.acs.solid.interfaces.ValueReader;

import java.util.HashMap;
import java.util.Map;

public class IocContainer {
    private Map<Class, Class> repo = new HashMap<>();

    public void register(Class contract, Class implementation) {
        repo.put(contract, implementation);
    }

    public Orchestrator resolveOrchestrator() {
        Class reader = repo.get(ValueReader.class);
        Class calculator = repo.get(Calculator.class);
        Class printer = repo.get(ValuePrinter.class);

        try {
            ValueReader valueReader = (ValueReader) reader.getConstructor().newInstance();
            Calculator calculatorIstance = (Calculator) calculator.getConstructor().newInstance();
            ValuePrinter valuePrinter = (ValuePrinter) printer.getConstructor().newInstance();

            Object orchestrator = Orchestrator.class.getConstructor(
                    ValueReader.class, Calculator.class, ValuePrinter.class).
                    newInstance(valueReader, calculatorIstance, valuePrinter);
            return (Orchestrator) orchestrator;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
