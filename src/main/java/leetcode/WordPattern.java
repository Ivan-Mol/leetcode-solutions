package leetcode;

import java.util.HashMap;

public interface WordPattern {
    static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                map.put(pattern.charAt(i), words[i]);
            }
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
