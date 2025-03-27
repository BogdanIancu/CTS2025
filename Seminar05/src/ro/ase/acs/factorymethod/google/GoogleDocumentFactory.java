package ro.ase.acs.factorymethod.google;

import ro.ase.acs.factorymethod.DocumentType;
import ro.ase.acs.factorymethod.contracts.AbstractDocumentFactory;
import ro.ase.acs.factorymethod.contracts.Document;
import ro.ase.acs.factorymethod.exceptions.NoSuchDocumentException;

public class GoogleDocumentFactory implements AbstractDocumentFactory {
    @Override
    public Document getDocument(DocumentType documentType) {
        if (documentType == DocumentType.TEXT) {
            return new GoogleDocument();
        } else if (documentType == DocumentType.SPREADSHEET) {
            return new GoogleSheetDocument();
        } else if (documentType == DocumentType.PRESENTATION) {
            return new GoogleSlidesDocument();
        } else throw new NoSuchDocumentException();
    }
}
