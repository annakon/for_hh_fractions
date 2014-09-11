package ru.maskan.fractions;

import org.apache.commons.io.FileUtils;
import ru.maskan.fractions.util.TextUtil;

import java.io.File;

/**
 * Created by akonshina on 11.09.14.
 */
public class Main {

    public static void main(String[] args) {

        try {
            String s = FileUtils.readFileToString(new File(args[0]));
            String result = Calculator.calculate(TextUtil.parse(s));

            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
