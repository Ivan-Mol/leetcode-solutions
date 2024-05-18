package codewars;
//{3, 4, 4, 3, 6, 3}->
//4, 6, 3

import java.util.LinkedHashSet;

public interface SimpleRemoveDuplicates {
    static int[] solve(int[] arr) {
        LinkedHashSet<Integer> integers = new LinkedHashSet<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            integers.add(arr[i]);
        }
        int[] res = new int[integers.size()];
        int counter = integers.size() - 1;
        for (Integer i : integers) {
            res[counter] = i;
            counter--;
        }
        return res;
    }
}
