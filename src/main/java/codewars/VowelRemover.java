package codewars;

public interface VowelRemover {
    static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }
}
