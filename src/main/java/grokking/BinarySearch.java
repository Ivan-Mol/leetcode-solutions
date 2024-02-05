package grokking;

public interface BinarySearch {
    static int binarySearch(int[] nums, int element){
        int low = 0;
        int high = nums.length-1;

        while (low<=high){
            int mid = (low+high)/2;
            if (mid==element){
                return mid;
            }else {
                if (element>mid){
                    low=mid+1;
                }else {
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
