package codewars;

public interface CSVInterpretation {
    static String toCsvText(int[][] array) {
        StringBuilder builder = new StringBuilder();
        for (int[] nums : array) {
            for (int anInt : nums) {
                builder.append(anInt);
                builder.append(",");
            }
            builder.deleteCharAt(builder.length() - 1);
            builder.append("\n");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }
}