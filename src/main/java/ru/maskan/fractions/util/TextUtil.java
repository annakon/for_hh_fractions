package ru.maskan.fractions.util;

import ru.maskan.fractions.InputData;
import ru.maskan.fractions.exceptions.InvalidArgumentException;

/**
 * Created by akonshina on 11.09.14.
 */
public class TextUtil {

    public static InputData parse(String textData) throws InvalidArgumentException {

        InputData i = null;

        for (String row : textData.split("\\n")) {

            if (i != null) {
                throw new InvalidArgumentException();
            }

            String[] numbers = row.split(" ");

            if (numbers.length != 3) {
                throw new InvalidArgumentException();
            }

            try {
                i = new InputData(
                        Integer.valueOf(numbers[0]),
                        Integer.valueOf(numbers[1]),
                        Integer.valueOf(numbers[2])
                );
            } catch (NumberFormatException e) {
                throw new InvalidArgumentException();
            }
        }

        return i;
    }
}
