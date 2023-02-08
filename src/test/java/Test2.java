import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class Test2 {
    @Parameterized.Parameters(name = "{index}: sumOf({0}+{1})={2}")

    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {3, 3, 6},
                {8, 5, 13},
                {10, 10, 20},
        });
    }

    private final double number1;
    private final double number2;
    private final double sum;

    public Test2(double number1,
                 double number2,
                 double sum) {

        this.number1 = number1;
        this.number2 = number2;
        this.sum = sum;
    }

    @Test
    public void shouldReturnCorrectSum() {

        Assert.assertEquals(sum, Calculator.getSum(number1, number2), 0.0001);
    }
}
