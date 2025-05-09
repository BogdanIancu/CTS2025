package ro.ase.acs.chain;

public class CallCenterOperator extends CallCenterHandler {
    public static final int OPERATOR_THRESHOLD = 100;

    @Override
    public void refund(double sum) {
        if (sum < OPERATOR_THRESHOLD) {
            System.out.println("Refund processed by the operator.");
        } else {
            if (nextHandler != null) {
                nextHandler.refund(sum);
            }
        }
    }
}
