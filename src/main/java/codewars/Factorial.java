package codewars;

public interface Factorial {
    static long factorial(int n) {
        if (n<=1){
            return n;
        }
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res = res*i;
        }
        return res;
    }
}
