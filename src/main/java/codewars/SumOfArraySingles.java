package codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

//4,5,7,5,4,8
//res = 15
public interface SumOfArraySingles {
    static int repeats(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
            }
            if (counter == 1) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}
