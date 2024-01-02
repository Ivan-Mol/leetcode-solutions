package codewars;

public interface EncryptThis {
    static String encryptThis(String text) {
        if (text.isBlank()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            for (int j = 0; j < word.length(); j++) {
                if (j == 0) {
                    int asci = word.charAt(0);
                    stringBuilder.append(asci);
                }
                if (j == 1) {
                    stringBuilder.append(word.charAt(word.length() - 1));
                }
                if (j == 2) {
                    stringBuilder.append(word, 2, word.length() - 1)
                            .append(word, 1, 2);


                }
            }
            if (i != arr.length - 1) {
                stringBuilder.append(" ");

            }
        }
        return stringBuilder.toString();
    }
}
