package leetcode;

import java.util.Arrays;

//Ввод: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Выход: [1,2,2,3,5,6]
public interface MergeSortedArray {
    static void merge(int[] nums1, int m, int[] nums2, int n) {

        int counter = 0;
        for (int i = m; i < nums1.length; i++) {
            if (counter < n) {
                nums1[i] = nums2[counter];
            }
            counter++;
        }

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < nums1.length - 1; i++) {
                if (nums1[i] > nums1[i + 1]) {
                    isSorted = false;
                    int temp = nums1[i];
                    nums1[i] = nums1[i + 1];
                    nums1[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
