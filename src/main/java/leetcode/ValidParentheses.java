package leetcode;

import java.util.ArrayList;

public interface ValidParentheses {

    //Valid Parentheses
//    Input: s = "()[]{}"
//    Output: true
     static boolean isValid(String s) {
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                chars.add(s.charAt(i));
            } else {
                if (chars.isEmpty()) {
                    return false;
                }
                if (s.charAt(i) == ')' && (chars.get(chars.size() - 1) != '(')) {
                    return false;
                }
                if (s.charAt(i) == '}' && (chars.get(chars.size() - 1) != '(')) {
                    return false;
                }
                if (s.charAt(i) == ']' && (chars.get(chars.size() - 1) != '(')) {
                    return false;
                }
                chars.remove(chars.size() - 1);
            }
        }
        return chars.isEmpty();
    }
}
