package ro.ase.acs.main;

import ro.ase.acs.factorymethod.DocumentType;
import ro.ase.acs.factorymethod.google.GoogleDocumentFactory;
import ro.ase.acs.factorymethod.microsoft.MicrosoftDocumentFactory;
import ro.ase.acs.factorymethod.contracts.AbstractDocumentFactory;
import ro.ase.acs.factorymethod.contracts.Document;
import ro.ase.acs.singletonregistry.SingletonRegistry;

public class Main {
    public static void main(String[] args) {
        SingletonRegistry singletonRegistry = new SingletonRegistry();
        SingletonRegistry.Logger logger = singletonRegistry.getSingleton(SingletonRegistry.Logger.class.getSimpleName());
        logger.log("Message");

        SingletonRegistry.DatabaseConnection databaseConnection = singletonRegistry.getSingleton("DatabaseConnection");
        databaseConnection.connect();

        AbstractDocumentFactory factory = new GoogleDocumentFactory();
        Document document = factory.getDocument(DocumentType.TEXT);
        document.setName("untitled");
        document.open();

        factory = new MicrosoftDocumentFactory();
        document = factory.getDocument(DocumentType.PRESENTATION);
        document.setName("untitled2");
        document.open();
    }
}
