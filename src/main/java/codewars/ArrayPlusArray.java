package codewars;

import java.util.Arrays;

public interface ArrayPlusArray {
    static int arrayPlusArray(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
    }
}
