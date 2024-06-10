package codewars;

import java.net.http.HttpClient;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CalculateMeanAndConcatinateString {
    public static Object[] mean(char[] lst) {
        StringBuilder builder = new StringBuilder();
        double sum = 0;
        int counter = 0;
        for (int i = 0; i < lst.length; i++) {
            if (Character.isDigit(lst[i])) {
                sum = sum + lst[i] - '0';
                counter++;
            } else builder.append(lst[i]);
        }
        System.out.println(sum);
        Map<Integer, Long> m = Stream.of(1, 2, 5, 3, 3, 52, 3, 2, 1, 3, 5, 3).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println(m);
        return new Object[]{sum / counter, builder.toString()};
    }
}
