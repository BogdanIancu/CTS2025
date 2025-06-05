package ro.ase.acs.classes;

import ro.ase.acs.exceptions.NullArrayException;

public class Operations {
    public double sum(int x, int y) {
        return x + y;
    }

    public double addition(double... values) throws NullArrayException {
        if (values == null) {
            throw new NullArrayException();
        }

        double sum = 0;

        for (int i = 0; i < values.length; i++) {
            if (sum + values[i] >= Double.MAX_VALUE) {
                return Double.MAX_VALUE;
            }
            sum += values[i];
        }


        double roundedSum = Math.round(sum * 100);
        return roundedSum / 100;
    }
}
