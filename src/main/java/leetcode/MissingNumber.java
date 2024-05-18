package leetcode;

import java.util.Arrays;

//An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
//
//Given an integer n, return true if n is an ugly number.
//Example 1:
//
//Input: n = 6
//Output: true
//Explanation: 6 = 2 × 3
//Example 2:
//
//Input: n = 1
//Output: true
//Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
public interface MissingNumber {
    static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] != 0) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 != nums[i + 1]) {
                return nums[i] + 1;
            }
        }
        return nums.length;
    }
}
