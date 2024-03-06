package leetcode;

import java.util.Arrays;

public interface SingleNumber {
    static int singleNumber(int[] nums) {
        int res = nums[0];
        int counter = 1;
        for (int i = 0; i <nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]==nums[j]&i!=j){
                    counter++;
                }
            }
            if (counter==1){
                res = nums[i];
            }
            counter = 1;
        }
        return res;
    }
}
