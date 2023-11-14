package completed;

import java.util.Arrays;

//Example 1:
//
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.
//Example 2:
//
//Input: s = "cbbd"
//Output: "bb"
public interface LongestPalindromicSubstring {
    static String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int frst = 0;
        int lst = arr.length-1;
        while (frst<=lst){
            if (arr[frst]!=arr[lst]){
                arr[frst]=  ' ';
                arr[lst] = ' ';
            }
            frst++;
            lst--;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]!=' '){
                builder.append(arr[i]);
            }
        }
        return builder.toString();
    }
}
