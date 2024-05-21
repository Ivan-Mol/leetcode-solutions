package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortAndStar {
    public static String twoSort(String[] s) {
        String res = Arrays.stream(s)
                .sorted()
                .findFirst()
                .get()
                .chars()
                .mapToObj(c -> Character.toString(c) + "***")
                .collect(Collectors.joining());
        return res.substring(0,res.length()-3);
    }
}