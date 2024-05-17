package codewars;

import java.util.Arrays;

public interface GetTheMeanOfNewArray {
    static int getAverage(int[] marks) {
        return Arrays.stream(marks).sum()/marks.length;
    }
}
