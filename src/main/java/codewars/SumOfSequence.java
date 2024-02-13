package codewars;


import java.util.ArrayList;
import java.util.List;

public class SumOfSequence {
    public static int sequenceSum(int start, int end, int step) {
        // write your code here
        List<Integer> nums = new ArrayList<>();
        for (int i = start; i <= end ; i=i+step) {
            nums.add(i);
        }
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum = sum + nums.get(i);
        }
        return sum;
    }
}