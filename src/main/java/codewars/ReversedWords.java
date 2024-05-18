package codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public interface ReversedWords {
    public static String reverseWords(String str) {
        List<String> strings = Arrays.asList(str.split(" "));
        Collections.reverse(strings);
        return String.join(" ", strings);
    }
}
