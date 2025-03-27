package ro.ase.acs.factorymethod.google;

import ro.ase.acs.factorymethod.contracts.AbstractDocument;

public class GoogleDocument extends AbstractDocument {
    GoogleDocument() {
    }

    @Override
    public void open() {
        System.out.println("Opening Google document " + name);
    }
}
