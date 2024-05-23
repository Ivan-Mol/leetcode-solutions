package codewars;

import java.util.stream.IntStream;

public class CountDig {

    public static int nbDig(int n, int d) {
        return IntStream.range(0, n + 1)
                .map(i -> i * i)
                .mapToObj(Integer::toString)
                .filter(s -> s.contains(Integer.toString(d)))
                .map(s -> s.chars().filter(ch -> ch == (char) (d + '0')).count())
                .mapToInt(Long::intValue).sum();
    }
}