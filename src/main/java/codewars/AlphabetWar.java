package codewars;

import java.util.HashMap;

public interface AlphabetWar {
    static String alphabetWar(String fight) {
        HashMap<String, Integer> left = new HashMap<>();
        left.put("w", 4);
        left.put("p", 3);
        left.put("b", 2);
        left.put("s", 1);
        HashMap<String, Integer> right = new HashMap<>();
        right.put("m", 4);
        right.put("q", 3);
        right.put("d", 2);
        right.put("z", 1);
        int leftScores = 0;
        int rightScores = 0;
        for (int i = 0; i < fight.length(); i++) {
            String symbol = Character.toString(fight.charAt(i));
            if (left.containsKey(symbol)) {
                leftScores = leftScores + left.get(symbol);
            }
            if (right.containsKey(symbol)) {
                rightScores = rightScores + right.get(symbol);
            }
        }
        if (leftScores > rightScores) {
            return "Left side wins!";
        }
        if (rightScores > leftScores) {
            return "Right side wins!";
        }
        return "Let's fight again!";
    }
}
