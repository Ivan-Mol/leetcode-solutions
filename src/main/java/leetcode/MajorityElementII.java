package leetcode;

import java.util.ArrayList;
import java.util.List;

public interface MajorityElementII {
    static List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int max = nums.length / 3;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                }
            }
            if (counter > max&&!res.contains(nums[i])) {
                res.add(nums[i]);
            }
            counter = 0;
        }
        return res;
    }
}
