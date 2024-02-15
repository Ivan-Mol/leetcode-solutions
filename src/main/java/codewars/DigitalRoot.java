package codewars;

public interface DigitalRoot {
    static int digital_root(int n) {
        String num = Integer.toString(n);
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum = sum + Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        return sum > 9 ? digital_root(sum) : sum;
    }
}
////    16  -->  1 + 6 = 7
////   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
////132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
////493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2