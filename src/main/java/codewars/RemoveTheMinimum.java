package codewars;

import java.util.Arrays;

public interface RemoveTheMinimum {
    public static int[] removeSmallest(int[] numbers) {
        int min = Arrays.stream(numbers).min().getAsInt();
        int counter = 0;
        int[] res = new int[numbers.length - 1];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != min) {
                res[counter] = numbers[i];
                counter++;
            }
        }
        return res;
    }
}