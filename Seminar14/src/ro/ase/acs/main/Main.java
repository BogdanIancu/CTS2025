package ro.ase.acs.main;

import ro.ase.acs.classes.FileWriter;
import ro.ase.acs.classes.Student;
import ro.ase.acs.exceptions.NullNameException;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        try {
            s.setName("John");
        } catch (NullNameException e) {
            throw new RuntimeException(e);
        }
        s.setFileWriter(new FileWriter());
        s.save();
    }
}
