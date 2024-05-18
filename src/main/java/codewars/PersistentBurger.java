package codewars;

public interface PersistentBurger {
    public static int persistence(long n) {
        int count = 0;

        while (n >= 10) {
            n = getMultiplyOfDigits(n);
            count++;
        }

        return count;
    }

    public static long getMultiplyOfDigits(long n) {
        int result = (int) n % 10;

        while ((n /= 10) > 0) {
            result *= n % 10;
        }

        return result;
    }
}
//39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
//999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
//4 --> 0 (because 4 is already a one-digit number)