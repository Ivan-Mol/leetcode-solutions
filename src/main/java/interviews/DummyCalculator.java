package interviews;

import java.util.Arrays;

public interface DummyCalculator {
     static int dummyCalculator(String expr){
        String[] arr = expr.split("\\+");
        int res = 0;
        for (String s : arr) {
            if (arr.length > 1) {
                String[] string = s.split("\\*");
                int num = Integer.parseInt(string[0]);
                for (int j = 1; j < string.length; j++) {
                    num = num * Integer.parseInt(string[j]);
                }
                res = res + num;
            } else {
                res = res + Integer.parseInt(s);
            }
        }
        return res;
    }
}
