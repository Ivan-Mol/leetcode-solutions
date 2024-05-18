package leetcode;

public interface LongestCommonPrefix {
    //    Longest Common Prefix
    //    Input: strs = ["flower","flow","flight"]
    //    Output: "fl"
    static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        if (strs == null || strs.length == 0) {
            return res.toString();
        }
        int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (minLength > strs[i].length()) {
                minLength = strs[i].length();
            }
        }

        for (int i = 0; i < minLength; i++) {
            char currLetter = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != currLetter) {
                    return res.toString();
                }
            }
            res.append(currLetter);
        }
        return res.toString();
    }

    //flower","flow","flight
    static String longestCommonPrefix2(String[] strs) {
        StringBuilder result = new StringBuilder();
        String shortestWord = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < shortestWord.length()) {
                shortestWord = strs[i];
            }
        }
        for (int i = 0; i < shortestWord.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (shortestWord.charAt(i) != strs[j].charAt(i)) {
                    return result.toString();
                }
            }
            result.append(shortestWord.charAt(i));
        }
        return result.toString();
    }
}
