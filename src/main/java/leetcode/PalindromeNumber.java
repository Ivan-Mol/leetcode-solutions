package leetcode;

public interface PalindromeNumber {
    //Palindrome Number example:
//    Input: x = 121
//    Output: true
//    Explanation: 121 reads as 121 from left to right and from right to left.
    static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
