package codewars;

import java.util.HashMap;
import java.util.Map;

public interface HelpTheBookseller {
    static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }
        HashMap<String, Integer> articles = new HashMap<>();
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            articles.put(lstOf1stLetter[i], 0);
        }
        for (int i = 0; i < lstOfArt.length; i++) {
            String key = Character.toString(lstOfArt[i].charAt(0));
            int numOfBooks = Integer.parseInt(lstOfArt[i].replaceAll("[^0-9]", ""));
            if (articles.containsKey(key)) {
                articles.put(key, articles.get(key) + numOfBooks);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Integer> article : articles.entrySet()) {
            stringBuilder.append("(" + article.getKey() + " : " + article.getValue()).append(") - ");
        }
        stringBuilder.delete(stringBuilder.length() - 3, stringBuilder.length());
        return stringBuilder.toString();
    }
}
