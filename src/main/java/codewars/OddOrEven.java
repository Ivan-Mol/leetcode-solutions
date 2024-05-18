package codewars;

import java.util.Arrays;

public interface OddOrEven {
    static String oddOrEven(int[] array) {
        return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}
