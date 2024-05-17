package codewars;

import java.util.HashMap;

public interface CharacterCounter {
     static boolean validateWord(String word) {
         HashMap<Character,Integer> map = new HashMap<>();
         for (int i = 0; i < word.length(); i++) {
             if (!map.containsKey(word.charAt(i))){
                 map.put(Character.toLowerCase(word.charAt(i)),1);
             }else {
                 map.put(Character.toLowerCase(word.charAt(i)),map.get(word.charAt(i))+1);
             }
         }
         return !map.containsValue(1);
    }
}
