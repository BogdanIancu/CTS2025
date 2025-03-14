package ro.ase.acs.solid.interfaces;

import ro.ase.acs.solid.exceptions.NullListException;

import java.util.List;

public interface Calculator {
    double computeResult(List<Integer> values) throws NullListException;
}
