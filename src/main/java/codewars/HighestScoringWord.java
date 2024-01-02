package codewars;

public interface HighestScoringWord {
    static String high(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String res = "";
        int bestScore = 0;
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            String word = strings[i];
            int score = 0;
            for (int j = 0; j < word.length(); j++) {
                int positionInAlp = alphabet.indexOf(word.charAt(j)) + 1;
                score = score + positionInAlp;
            }
            if (score > bestScore) {
                bestScore = score;
                res = strings[i];
            }

        }
        return res;
    }
}
