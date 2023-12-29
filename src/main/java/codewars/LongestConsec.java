package codewars;

import java.util.Arrays;

//strarr = ["tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"], k = 2
//
//Concatenate the consecutive strings of strarr by 2, we get:
//
//treefoling   (length 10)  concatenation of strarr[0] and strarr[1]
//folingtrashy ("      12)  concatenation of strarr[1] and strarr[2]
//trashyblue   ("      10)  concatenation of strarr[2] and strarr[3]
//blueabcdef   ("      10)  concatenation of strarr[3] and strarr[4]
//abcdefuvwxyz ("      12)  concatenation of strarr[4] and strarr[5]
//
//Two strings are the longest: "folingtrashy" and "abcdefuvwxyz".
//The first that came is "folingtrashy" so
//longest_consec(strarr, 2) should return "folingtrashy".
//
//In the same way:
//longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
//{"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1) --> oocccffuucccjjjkkkjyyyeehh
public interface LongestConsec {

    static String longestConsec(String[] strarr, int k) {
        // your code
        String result = "";
        StringBuilder words = new StringBuilder();
        for (int i = 0; i < strarr.length-(k-1); i++) {
            for (int j = 0; j < k; j++) {
                words.append(strarr[i+j]);
            }
            if (words.toString().length()>result.length()){
                result= words.toString();
            }
            words.delete(0,words.length());
        }

        return result;
    }
}