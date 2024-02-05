package codewars;

import java.util.Arrays;

//UniqueArray.unique([1, 5, 2, 0, 2, -3, 1, 10])
// -> [1, 5, 2, 0, -3, 10]
public interface RemoveDublicates {
    public static int[] unique(int[] integers) {
        return Arrays.stream(integers).distinct().toArray();
    }
}
