package codewars;

public interface ScaledSquaredStrings {
    static String scale(String strng, int k, int v) {
        String[] words = strng.split("\n");
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            for (int j = 0; j < word.length(); j++) {
                builder.append(String.valueOf(word.charAt(j)).repeat(Math.max(0, k)));
            }
            builder.append("\n");
        }
        words = builder.toString().split("\n");
        builder.delete(0, builder.length());
        for (String s : words) {
            for (int l = 0; l < v; l++) {
                builder.append(s);
                builder.append("\n");
            }
        }
        return builder.toString();
    }
}
