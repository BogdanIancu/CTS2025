package ro.ase.acs.classes;

import java.io.*;

public class FileWriter implements Serializable, AbstractFileWriter {
    public void write(Object o) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("export.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(o);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
