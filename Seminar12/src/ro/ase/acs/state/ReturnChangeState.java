package ro.ase.acs.state;

public class ReturnChangeState implements VendingMachineState {
    @Override
    public void displayMessage() {
        System.out.println("Pick up change");
    }
}
