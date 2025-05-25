package ro.ase.acs.classes;

public class Operations {
    public double sum(int x, int y) {
        return x + y;
    }

    public double addition(double... values) {
        double sum = 0;

        if (values != null) {
            for (int i = 0; i < values.length; i++) {
                if (sum + values[i] >= Double.MAX_VALUE) {
                    return Double.MAX_VALUE;
                }
                sum += values[i];
            }
        }

        double roundedSum = Math.round(sum * 100);
        return roundedSum / 100;
    }
}
