package codewars;

import java.util.Arrays;

public interface ZywOo {
    public static int[] take(int[] arr, int n) {
        return Arrays.stream(arr).limit(n).toArray();
    }

    //22, -6, 32, 82, 9, 25
//[-6, 32, 25]
    public static int[] multipleOfIndex(int[] array) {
        int counter = 1;
        if (array[0] == 0) {
            counter = 2;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                array[counter - 1] = array[i];
                counter++;
            }
        }
        counter--;
        int[] res = new int[counter];
        for (int i = 0; i < counter; i++) {
            res[i] = array[i];
        }
        return res;
    }
}