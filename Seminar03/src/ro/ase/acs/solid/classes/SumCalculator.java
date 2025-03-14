package ro.ase.acs.solid.classes;

import ro.ase.acs.solid.exceptions.NullListException;
import ro.ase.acs.solid.interfaces.Calculator;

import java.util.List;

public class SumCalculator implements Calculator {
    @Override
    public double computeResult(List<Integer> values) throws NullListException {
        if(values == null) {
            throw new NullListException();
        }
        return values.stream().mapToInt(v->v).sum();
    }
}
