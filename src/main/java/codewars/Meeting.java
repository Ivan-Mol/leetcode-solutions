package codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface Meeting {
//"Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill"
//"(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"
    public static String meeting(String s) {
        // your code
        String[] strings = s.toUpperCase().split(";");
        List<String> res = new ArrayList<>();
        for (int i = 0; i <strings.length ; i++) {
            String[] name = strings[i].split(":");
            res.add("("+name[1]+", "+name[0]+")");
        }
        Collections.sort(res);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < res.size(); i++) {
            stringBuilder.append(res.get(i));
        }
        return stringBuilder.toString();
    }
}