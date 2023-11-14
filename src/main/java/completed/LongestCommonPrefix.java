package completed;

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
}
