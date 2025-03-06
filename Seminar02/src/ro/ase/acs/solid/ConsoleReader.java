package ro.ase.acs.solid;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleReader implements Closeable, ValueReader {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public List<Integer> readValues() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Value " + (i + 1) + " = ");
            numbers.add(scanner.nextInt());
        }

        return numbers;
    }

    @Override
    public void close() {
        scanner.close();
    }
}
