package ro.ase.acs.state;

public class VendingMachine {
    private VendingMachineState state;
    private double balance = 0;

    public VendingMachine() {
        state = new InputMoneyState();
        state.displayMessage();
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void inputMoney(double amount) {
        balance += amount;
        state = new SelectProductState();
        state.displayMessage();
    }

    public void selectProduct(double price) {
        if (price <= balance) {
            balance -= price;
            state = new ProductDeliveryState();
            state.displayMessage();

            if (balance > 0) {
                state = new ReturnChangeState();
                state.displayMessage();
                balance = 0;
            }
        }
        state = new InputMoneyState();
        state.displayMessage();
    }

}
