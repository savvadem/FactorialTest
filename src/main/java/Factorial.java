import com.google.common.base.Preconditions;

import java.math.BigInteger;

/**
 *
 */
public class Factorial {

    /**
     * Посчитать количество нолей для факториала числа n
     * @param n - число
     * @return количество нолей
     */
    public int countFactorialZero(int n) {
        Preconditions.checkArgument(n >= 0, "Value should be >= 0");
        int count = 0;
        for (int i = 1; i <= n; ++i) {
            int cur = i;
            while ( cur != 0 && cur % 5 == 0)
            {
                count++;
                cur = cur / 5;
            }
        }
        return count;
    }

    public BigInteger factorial(int n)
    {
        BigInteger ret = BigInteger.ONE;
        for (int i = 1; i <= n; ++i) ret = ret.multiply(BigInteger.valueOf(i));
        return ret;
    }

}
