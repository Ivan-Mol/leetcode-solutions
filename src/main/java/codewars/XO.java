package codewars;

public interface XO {

    public static boolean getXO(String str) {
        int o = 0;
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
                o++;
            }
            if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
                x++;
            }

        }
        return x == o;
    }
}