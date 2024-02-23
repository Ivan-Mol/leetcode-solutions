package codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public interface ReversedSequence {

     static int[] reverse(int n){
        return IntStream.rangeClosed(1,n).map(i -> 1 - i + n).toArray();
    }

}
//Example : n=5 --> [5,4,3,2,1]