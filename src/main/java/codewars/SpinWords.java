package codewars;

//"Hey fellow warriors"  --> "Hey wollef sroirraw"
public interface SpinWords {

    static String spinWords(String sentence) {
        StringBuilder builder = new StringBuilder();
        for (String word : sentence.split(" ")) {
            if (word.length() > 4) {
                builder.append(new StringBuilder().append(word).reverse().append(" "));
            } else {
                builder.append(word).append(" ");
            }
        }
        return builder.toString().trim();
    }
}