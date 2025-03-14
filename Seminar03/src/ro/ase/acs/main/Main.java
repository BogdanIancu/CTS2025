package ro.ase.acs.main;

import ro.ase.acs.solid.IocContainer;
import ro.ase.acs.solid.ServiceLocator;
import ro.ase.acs.solid.classes.ConsolePrinter;
import ro.ase.acs.solid.classes.ConsoleReader;
import ro.ase.acs.solid.classes.SumCalculator;
import ro.ase.acs.solid.interfaces.Calculator;
import ro.ase.acs.solid.interfaces.ValuePrinter;
import ro.ase.acs.solid.interfaces.ValueReader;

public class Main {
    public static void main(String[] args) {
        // Version 1: Constructor + setter injection
        Orchestrator orchestrator = new Orchestrator(
                new ConsoleReader(),
                new ConsolePrinter()
        );
        orchestrator.setCalculator(new SumCalculator());
        orchestrator.execute();

        // Version 2: using a Service Locator
        ServiceLocator serviceLocator = new ServiceLocator();
        serviceLocator.register("ValueReader", new ConsoleReader());
        serviceLocator.register("ValuePrinter", new ConsolePrinter());
        serviceLocator.register(Calculator.class.getSimpleName(), new SumCalculator());

        orchestrator = new Orchestrator(serviceLocator);
        orchestrator.execute();

        // Version 3: using an IoC Container
        IocContainer iocContainer = new IocContainer();
        iocContainer.register(ValueReader.class, ConsoleReader.class);
        iocContainer.register(Calculator.class, SumCalculator.class);
        iocContainer.register(ValuePrinter.class, ConsolePrinter.class);

        orchestrator = iocContainer.resolveOrchestrator();
        orchestrator.execute();
    }
}
