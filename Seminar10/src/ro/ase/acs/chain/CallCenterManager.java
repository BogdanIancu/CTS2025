package ro.ase.acs.chain;

public class CallCenterManager extends CallCenterHandler {

    @Override
    public void refund(double sum) {
        System.out.println("Refund processed by the manager.");
    }
}
