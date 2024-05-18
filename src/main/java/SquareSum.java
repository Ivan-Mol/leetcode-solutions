import java.util.Arrays;

//Complete the square sum function so that it squares each number passed into it and then sums the results together.
//
//For example, for [1, 2, 2] it should return 9 because
public interface SquareSum {
    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(v -> v * v).sum();
    }
}
