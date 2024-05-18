package codewars;

import java.util.stream.IntStream;

public interface DontGiveMeFive {
    public static int dontGiveMeFive(int start, int end) {
        return (int) IntStream.rangeClosed(start, end).filter(i -> !Integer.toString(i).contains("5")).count();
    }
}
