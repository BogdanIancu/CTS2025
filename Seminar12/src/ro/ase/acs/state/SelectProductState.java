package ro.ase.acs.state;

public class SelectProductState implements VendingMachineState {
    @Override
    public void displayMessage() {
        System.out.println("Select product");
    }
}
