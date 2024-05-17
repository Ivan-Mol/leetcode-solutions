package codewars;

import java.util.Arrays;

//"a #b\nc\nd $e f g", new String[] { "#", "$" }
public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {
        String[] lines = text.split("\n");
        for (String commentSymbol : commentSymbols) {
            for (int i = 0; i < lines.length; i++) {
                if (lines[i].contains(commentSymbol)) {
                    lines[i] = lines[i].substring(0,lines[i].indexOf(commentSymbol));
                }
                if (lines[i].charAt(lines[i].length()-1)==' '){
                    lines[i] = lines[i].substring(0,lines[i].length()-1);
                }
            }
        }
        return String.join("\n",lines);
    }
}