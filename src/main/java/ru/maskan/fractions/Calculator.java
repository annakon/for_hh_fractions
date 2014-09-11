package ru.maskan.fractions;

/**
 * Created by akonshina on 11.09.14.
 */
public class Calculator {

    public static String calculate(InputData i) {
        return calculate(i.getA(), i.getN(), i.getRadix());
    }

    public static String calculate(int a, int n, int radix) {

        StringBuilder calculatedPredPeriod = new StringBuilder();
        StringBuilder calculatedPeriod = new StringBuilder();

        int currentLength = 0;

        int predPeriodLength = CalculatePredPeriodLength(n);

        while (currentLength != predPeriodLength && a > 0) {
            calculatedPredPeriod.append((a * radix) / n);
            a = (a * radix) % n;
            currentLength++;
        }

        if (a == 0) {
            calculatedPredPeriod.insert(0, "0,");
            return calculatedPredPeriod.toString();
        }

        int c = a;
        do {
            calculatedPeriod.append((a * radix) / n);
            a = (a * radix) % n;
        } while (c != a);

        String period = calculatedPeriod.toString();

        return "0," + calculatedPredPeriod + "(" + period + ")";
    }

    private static int CalculatePredPeriodLength(int n) {
        int dividers2 = 0;
        int dividers5 = 0;

        boolean divided2, divided5;

        do {
            divided2 = false;
            divided5 = false;

            if (n % 2 == 0) {
                dividers2++;
                n = n / 2;

                divided2 = true;
            }

            if (n % 5 == 0) {
                dividers5++;
                n = n / 5;

                divided5 = true;
            }
        } while (divided2 || divided5);

        return Math.max(dividers2, dividers5);
    }
}
