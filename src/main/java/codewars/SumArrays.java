package codewars;

import java.util.Arrays;

public interface SumArrays {
    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
