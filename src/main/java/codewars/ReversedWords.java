package codewars;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface ReversedWords {
    public static String reverseWords(String str){
        List<String> strings = Arrays.asList(str.split(" "));
        Collections.reverse(strings);
        return String.join(" ",strings );
    }
}
