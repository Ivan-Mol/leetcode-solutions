package leetcode;

import java.util.Arrays;

public interface RemoveDuplicatesFromSortedArrayII {
    static int removeDuplicates(int[] nums) {
        int index = 1;
        int counter = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                counter++;
            } else {
                counter = 1;
            }

            if (counter <= 2) {
                nums[index] = nums[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return index;
    }
}
