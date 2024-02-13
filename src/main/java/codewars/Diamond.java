package codewars;

public interface Diamond {
    public static String print(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        for (int i = n-1; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
