import org.junit.Test;
import ru.maskan.fractions.Calculator;
import ru.maskan.fractions.exceptions.InvalidArgumentException;

import static org.junit.Assert.assertEquals;

/**
 * Created by akonshina on 11.09.14.
 */
public class FractionsTests {



    @Test
    public void testNoPeriod() throws InvalidArgumentException {

        int a = 1, n = 800; int radix = 10;

        assertEquals("0,00125", Calculator.calculate(a, n, radix));
    }

    @Test
    public void testNoPeriod2() throws InvalidArgumentException {

        int a = 1, n = 2; int radix = 8;

        assertEquals("0,4", Calculator.calculate(a, n, radix));
    }

    @Test
    public void testJustForFun() throws InvalidArgumentException {


        int a = 1, n = 103; int radix = 10;

        assertEquals("0,(0097087378640776699029126213592233)", Calculator.calculate(a, n, radix));
    }

    @Test
    public void testOnlyPeriodLong() throws InvalidArgumentException {


        int a = 1, n = 101; int radix = 10;

        assertEquals("0,(0099)", Calculator.calculate(a, n, radix));
    }

    @Test
    public void testOnlyPeriodShort() throws InvalidArgumentException {

        int a = 1, n = 3; int radix = 10;

        assertEquals("0,(3)", Calculator.calculate(a, n, radix));
    }

    @Test
    public void testOnlyPeriodRadix() throws InvalidArgumentException {

        int a = 1, n = 3; int radix = 2;

        assertEquals("0,(01)", Calculator.calculate(a, n, radix));
    }

    @Test
    public void testOnlyPeriodLong2() throws InvalidArgumentException {

        int a = 25, n = 39; int radix = 10;

        assertEquals("0,(641025)", Calculator.calculate(a, n, radix));
    }

    @Test
    public void testPredPeriod() throws InvalidArgumentException {

        int a = 7, n = 12; int radix = 10;

        assertEquals("0,58(3)", Calculator.calculate(a, n, radix));
    }

    @Test
    public void testPredPeriod2() throws InvalidArgumentException {

        int a = 1, n = 420; int radix = 10;

        assertEquals("0,00(238095)", Calculator.calculate(a, n, radix));
    }

    @Test
    public void testPredPeriodPlusShort() throws InvalidArgumentException {

        int a = 1, n = 12; int radix = 10;

        assertEquals("0,08(3)", Calculator.calculate(a, n, radix));
    }

}
