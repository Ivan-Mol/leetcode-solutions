import java.util.Scanner;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0;
        if (n <= 0) {
            res = -1;
        } else if (n == 1) {
            res = 0;
        } else if (n == 2) {
            res = 1;
        } else {
            int[] fib = new int[n];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            res = fib[n - 1];
        }
        System.out.println(res);
        scanner.close();
    }
}