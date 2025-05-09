package ro.ase.acs.chain;

public class CallCenterOfficer extends CallCenterHandler {
    public static final int OFFICER_THRESHOLD = 500;

    @Override
    public void refund(double sum) {
        if (sum < OFFICER_THRESHOLD) {
            System.out.println("Refund processed by the officer.");
        } else {
            if (nextHandler != null) {
                nextHandler.refund(sum);
            }
        }
    }
}
