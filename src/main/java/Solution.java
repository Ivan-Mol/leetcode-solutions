public class Solution {

    //    Two Sums example:
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    //Palindrome Number example:
//    Input: x = 121
//    Output: true
//    Explanation: 121 reads as 121 from left to right and from right to left.
    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //Roman to Integer example:
    //Input: s = "MCMXCIV"
//    Output: 1994
//    Explanation: L = 50, V= 5, III = 3.
//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int res = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            switch (chars[i]) {
                case 'I':
                    res = res + 1;
                    break;
                case 'V':
                    if (i > 0 && chars[i - 1] == 'I') {
                        res = res + 4;
                        i--;
                    } else {
                        res = res + 5;
                    }
                    break;
                case 'X':
                    if (i > 0 && chars[i - 1] == 'I') {
                        res = res + 9;
                        i--;
                    } else {
                        res = res + 10;
                    }
                    break;
                case 'L':
                    if (i > 0 && chars[i - 1] == 'X') {
                        res = res + 40;
                        i--;
                    } else {
                        res = res + 50;
                    }
                    break;
                case 'C':
                    if (i > 0 && chars[i - 1] == 'X') {
                        res = res + 90;
                        i--;
                    } else {
                        res = res + 100;
                    }
                    break;
                case 'D':
                    if (i > 0 && chars[i - 1] == 'C') {
                        res = res + 400;
                        i--;
                    } else {
                        res = res + 500;
                    }
                    break;
                case 'M':
                    if (i > 0 && chars[i - 1] == 'C') {
                        res = res + 900;
                        i--;
                    } else {
                        res = res + 1000;
                    }
                    break;
            }
        }
        return res;
    }

    //    Longest Common Prefix
//    Input: strs = ["flower","flow","flight"]
//    Output: "fl"
    public static String longestCommonPrefix(String[] strs) {
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
