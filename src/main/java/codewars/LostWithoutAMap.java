package codewars;

import java.util.Arrays;

public interface LostWithoutAMap {
    static int[] map(int[] arr) {
        return Arrays.stream(arr).map(i->i*2).toArray();
    }
}
