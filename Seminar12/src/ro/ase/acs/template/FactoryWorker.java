package ro.ase.acs.template;

public class FactoryWorker extends PartMover {

    @Override
    protected void liftPart() {
        System.out.println("lift the part");
    }

    @Override
    protected void transportPart() {
        System.out.println("transport the part");
    }

    @Override
    protected void dropPart() {
        System.out.println("drop the part");
    }
}
