package codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface MultiplicationTableForNumber {
    public static String multiTable(int num) {
        String str = "a12.334tyz.78x".replaceAll("[^\\d]", "");
        System.out.println(str);
        return IntStream
                .range(1, 11)
                .mapToObj(i -> i + " * " + num + " = " + i * num)
                .collect(Collectors.joining("\n"));
    }
}
