package ro.ase.acs.factorymethod.google;

import ro.ase.acs.factorymethod.contracts.AbstractDocument;

public class GoogleSheetDocument extends AbstractDocument {
    GoogleSheetDocument() {
    }

    @Override
    public void open() {
        System.out.println("Opening Google Sheet document " + name);
    }
}
