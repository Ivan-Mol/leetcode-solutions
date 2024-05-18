package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface MedianOfTwoSortedArrays {
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int k : nums1) {
            list.add(k);
        }
        for (int j : nums2) {
            list.add(j);
        }
        Collections.sort(list);
        if (list.size() % 2 != 0) {
            return (float) list.get(list.size() / 2);
        } else {
            return ((float) list.get(list.size() / 2 - 1) + (float) list.get(list.size() / 2)) / 2;
        }
    }
}
