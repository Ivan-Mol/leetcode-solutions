package codewars;

import java.util.stream.IntStream;

public class CountTheMonkeys {
    public static int[] monkeyCount(final int n) {
        return IntStream.range(0, n + 1).toArray();
    }
}
