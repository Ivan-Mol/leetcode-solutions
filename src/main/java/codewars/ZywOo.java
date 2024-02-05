package codewars;

import java.util.Arrays;

public interface ZywOo {
    public static int[] take(int[] arr, int n) {
        return Arrays.stream(arr).limit(n).toArray();
    }
}