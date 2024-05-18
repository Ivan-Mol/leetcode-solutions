package codewars;

public interface GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        return word.length() % 2 == 0 ? Character.toString(word.charAt(word.length() / 2 - 1)) + Character.toString(word.charAt(word.length() / 2)) : Character.toString((word.charAt(word.length() / 2)));
    }
}
