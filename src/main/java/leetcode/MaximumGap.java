package leetcode;

import java.util.Arrays;

public interface MaximumGap {
    static int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int difference = Math.abs(nums[1]-nums[0]);
        for (int i = 0; i < nums.length-1; i++) {
            int curr = nums[i+1]-nums[i];
            if (difference<curr){
                difference=curr;
            }
        }
        return difference;
    }
}
