import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test3 {
    @Parameterized.Parameters(name = "{index}: multiplyOf({0}*{1})={2}")

    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0, 0},
                {5, 5, 25},
                {2, 10, 20},
        });
    }
    private final double number1;
    private final double number2;
    private final double multiply;

    public Test3(double number1,
                 double number2,
                 double multiply) {
        this.number1 = number1;
        this.number2 = number2;
        this.multiply = multiply;
    }

    @Test
    public void shouldReturnCorrectMultiply() {

        Assert.assertEquals(multiply, Calculator.getMultiplication(number1, number2), 0.0001);
    }
}

