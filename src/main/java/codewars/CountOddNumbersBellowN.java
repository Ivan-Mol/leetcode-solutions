package codewars;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public interface CountOddNumbersBellowN {
     static int oddCount(int n) {
         return n/2;
    }

}
//7  -> 3 (because odd numbers below 7 are [1, 3, 5])
//15 -> 7 (because odd numbers below 15 are [1, 3, 5, 7, 9, 11, 13])