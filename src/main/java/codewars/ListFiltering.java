package codewars;

import java.util.ArrayList;
import java.util.List;

public interface ListFiltering {
    static List<Object> filterList(final List<Object> list) {
        List<Object> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                res.add(list.get(i));
            }
        }
        return res;
    }
}
