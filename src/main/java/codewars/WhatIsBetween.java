package codewars;

import java.util.stream.IntStream;

public class WhatIsBetween {
    public static int[] between(int a, int b) {
        // your code here
        return IntStream.range(a,b+1).toArray();
    }
}
