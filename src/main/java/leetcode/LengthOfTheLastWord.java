package leetcode;

public interface LengthOfTheLastWord {
    static int lengthOfLastWord(String s) {
        s= s.trim();
        String word = s.substring(s.lastIndexOf(' '),s.length()-1);
        return word.length();
    }
}
