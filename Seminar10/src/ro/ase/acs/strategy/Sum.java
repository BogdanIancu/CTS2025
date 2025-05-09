package ro.ase.acs.strategy;

import java.util.List;

public class Sum implements Operation{

    @Override
    public double executeOperation(List<Integer> numbers) {
        double sum = 0;
        if(numbers!=null){
            for(int i:numbers){
                sum += i;
            }
        }
        return sum;
    }
}
