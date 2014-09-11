package ru.maskan.fractions;

import ru.maskan.fractions.exceptions.InvalidArgumentException;

/**
 * Created by akonshina on 11.09.14.
 */
public class InputData {
    int a;
    int n;
    int radix;

    public InputData(int a, int n, int radix) throws InvalidArgumentException {

        if (a >= n) {
            throw new InvalidArgumentException();
        }

        this.a = a;
        this.n = n;
        this.radix = radix;
    }

    public int getA() {
        return a;
    }

    public int getN() {
        return n;
    }

    public int getRadix() {
        return radix;
    }
}
