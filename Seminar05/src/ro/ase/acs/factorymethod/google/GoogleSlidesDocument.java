package ro.ase.acs.factorymethod.google;

import ro.ase.acs.factorymethod.contracts.AbstractDocument;

public class GoogleSlidesDocument extends AbstractDocument {
    GoogleSlidesDocument() {
    }

    @Override
    public void open() {
        System.out.println("Opening Google Slides document " + name);
    }
}
