package ro.ase.acs.solid;

public class ConsolePrinter implements ValuePrinter {

    @Override
    public void printResult(double result){
        System.out.println("The result is " + result);
    }

}
