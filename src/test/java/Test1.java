import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class Test1 {
    @Parameterized.Parameters(name = "{index}: divisionOf({0}/{1})={2}")

    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {4, 2, 2},
                {3, 3, 1},
                {49, 7, 7},
        });
    }

    private final double number1;
    private final double number2;
    private final double division;

    public Test1(double number1,
                 double number2,
                 double division) {

        this.number1 = number1;
        this.number2 = number2;
        this.division = division;
    }

    @Test
    public void shouldReturnCorrectDivision() {

        Assert.assertEquals(division, Calculator.getDivision(number1, number2), 0.0001);
    }
}
