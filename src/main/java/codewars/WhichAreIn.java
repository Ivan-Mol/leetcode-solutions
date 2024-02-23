package codewars;

import java.util.Arrays;

public interface WhichAreIn {

    static String[] inArray(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(str1 -> Arrays.stream(array2).anyMatch(str2 -> str2.contains(str1)))
                .distinct()
                .sorted()
                .toArray(String[]::new);

    }
}
