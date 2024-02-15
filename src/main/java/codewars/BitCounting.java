package codewars;

import java.util.Arrays;
import java.util.stream.Stream;

public interface BitCounting {

    static int countBits(int n) {
        return Integer.toBinaryString(n).chars().map(Character::getNumericValue).sum();
    }

}