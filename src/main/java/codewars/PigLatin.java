package codewars;

//pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
//pigIt('Hello world !');     // elloHay orldway !
public interface PigLatin {
    static String pigIt(String str) {
        StringBuilder builder = new StringBuilder();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean isPunctuationHere = false;
            for (int j = 0; j < word.length(); j++) {
                if (!Character.isAlphabetic(word.charAt(j))) {
                    isPunctuationHere = true;
                }
            }
            if (isPunctuationHere) {
                builder.append(word);
            } else {
                builder.append(word.substring(1))
                        .append(word.charAt(0))
                        .append("ay ");
            }
        }
        return builder.toString().trim();
    }
}