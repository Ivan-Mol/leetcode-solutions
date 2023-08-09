package completed;

import java.util.Arrays;

public interface RemoveDuplicates {
    //    Input: nums = [1,1,2]
//    Output: 2, nums = [1,2,_]
//    Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//    It does not matter what you leave beyond the returned k (hence they are underscores).
     static int removeDuplicates(int[] nums) {
        int counter = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] && nums[i] > nums[i - 1]) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return counter;
    }
}
