package ro.ase.acs.strategy;

import java.util.List;

public class Product implements Operation{

    @Override
    public double executeOperation(List<Integer> numbers) {
        double product = 1;
        if(numbers!=null){
            for(int i:numbers){
                product *= i;
            }
        }
        return product;
    }
}
