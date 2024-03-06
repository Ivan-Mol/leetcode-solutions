package leetcode;

public interface IsPalindrome {
    static boolean isPalindrome(String s) {
       String ss = s.replaceAll("\\W","");
        for (int i = 0; i < ss.length(); i++) {
            if (Character.toLowerCase(ss.charAt(i))!=Character.toLowerCase(ss.charAt(ss.length()-1-i))){
                return false;
            }
        }
       return true;
    }
}
