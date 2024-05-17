package codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class PeteBaker {
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        if (recipe.size()>available.size()){
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<String,Integer> ingr: recipe.entrySet() ){
            if (available.containsKey(ingr.getKey())){
                list.add(available.get(ingr.getKey())/ingr.getValue());
            }else {
                return 0;
            }
        }
        Collections.sort(list);
        return list.get(0);
    }
}