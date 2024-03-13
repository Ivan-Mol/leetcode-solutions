package leetcode;

public interface FindPeakElement {
    static int findPeakElement(int[] nums) {
        int peak = nums[0];
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (peak<nums[i]){
                peak=nums[i];
                position = i;
            }
        }
        return position;
    }
}
