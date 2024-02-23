package codewars;

import java.util.Arrays;

public interface SplitAndThenAddBothSidesOfAnArrayTogether {

    public static int[] splitAndAdd(int[] numbers, int n) {
        int counter = 0;
        while (counter != n) {
            int[] first = Arrays.copyOf(numbers, numbers.length / 2);
            int[] second = Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length);
            int frstCounter = first.length - 1;
            for (int i = second.length - 1; i >= 0; i--) {
                if (frstCounter >= 0) {
                    second[i] = second[i] + first[frstCounter];
                }
                frstCounter--;
            }
            numbers = second;
            counter++;
        }
        return numbers;
    }

}