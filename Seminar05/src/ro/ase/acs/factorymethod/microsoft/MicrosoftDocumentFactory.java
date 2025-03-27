package ro.ase.acs.factorymethod.microsoft;

import ro.ase.acs.factorymethod.DocumentType;
import ro.ase.acs.factorymethod.contracts.AbstractDocumentFactory;
import ro.ase.acs.factorymethod.contracts.Document;
import ro.ase.acs.factorymethod.exceptions.NoSuchDocumentException;

public class MicrosoftDocumentFactory implements AbstractDocumentFactory {
    @Override
    public Document getDocument(DocumentType documentType) {
        if (documentType == DocumentType.TEXT) {
            return new WordDocument();
        } else if (documentType == DocumentType.SPREADSHEET) {
            return new ExcelDocument();
        } else if (documentType == DocumentType.PRESENTATION) {
            return new PowerPointDocument();
        } else throw new NoSuchDocumentException();
    }
}
