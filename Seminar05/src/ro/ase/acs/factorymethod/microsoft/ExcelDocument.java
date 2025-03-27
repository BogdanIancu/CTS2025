package ro.ase.acs.factorymethod.microsoft;

import ro.ase.acs.factorymethod.contracts.AbstractDocument;

public class ExcelDocument extends AbstractDocument {
    ExcelDocument() {
    }

    @Override
    public void open() {
        System.out.println("Opening Excel document " + name);
    }
}
