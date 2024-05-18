package codewars;

import java.util.Arrays;

public interface MaximumSubarraySum {
    static int sequence(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int sumOfAll = Arrays.stream(arr).sum();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum > sumOfAll) {
                    sumOfAll = sum;
                }
            }
        }
        if (sumOfAll <= 0) {
            return 0;
        }
        return sumOfAll;
    }
}