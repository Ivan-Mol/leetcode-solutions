package codewars;

public interface NumberOfTrailingZerosOfN {
    static int zeros(int n) {
        int fives = 0;
        for (int i = 1; i <= n; i++) {
            fives += countFactors(i, 5);
        }

        return fives;
    }

    static int countFactors(int n, int fac) {
        int count = 0;
        while (n >= fac && (n % fac) == 0) {
            n /= fac;
            ++count;
        }
        return count;
    }
}
