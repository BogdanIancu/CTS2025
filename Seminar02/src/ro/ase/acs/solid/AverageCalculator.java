package ro.ase.acs.solid;

import java.util.List;

public class AverageCalculator implements Calculator {
    @Override
    public double computeResult(List<Integer> numbers) {
        if(numbers != null){
            return numbers.stream().mapToInt(x -> (int)x ).average().getAsDouble();
        }
        return 0;
    }


}
