import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class FactorialTest {

    private int factorialZeroCount;

    private int value;

    public FactorialTest(int value, int factorialZeroCount){

        this.factorialZeroCount = factorialZeroCount;

        this.value = value;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {

        Object[][] data = new Object[][]{
                {0, 0},
                {1, 0},
                {5, 1},
                {10, 2},
                {15, 3},
                {20, 4},
                {25, 6},
                {30, 7},
                {50, 12},
                {100, 24},
        };

        return Arrays.asList(data);
    }

    @Test
    public void testFactorialZeroCount()
    {
        Factorial factorial = new Factorial();
        int testValue = factorial.countFactorialZero(value);
        Assert.assertEquals(testValue, factorialZeroCount);
    }
}
