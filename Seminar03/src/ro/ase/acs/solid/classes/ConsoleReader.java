package ro.ase.acs.solid.classes;

import ro.ase.acs.solid.interfaces.ValueReader;

import java.util.List;

public class ConsoleReader implements ValueReader {
    @Override
    public List<Integer> readValues() {
        return List.of(1, 2, 3, 4, 5);
    }
}
