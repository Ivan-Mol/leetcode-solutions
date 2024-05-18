package codewars;

import java.util.List;

public interface BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return binary.stream()
                .reduce((res, bit) -> res * 2 + bit)
                .orElse(0);
    }
}
