package ro.ase.acs.chain;

public abstract class CallCenterHandler {
    protected CallCenterHandler nextHandler;

    public void setNextHandler(CallCenterHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void refund(double sum);
}
