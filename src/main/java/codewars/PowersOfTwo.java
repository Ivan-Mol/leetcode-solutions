package codewars;
//n = 0  ==> [1]        # [2^0]
//n = 1  ==> [1, 2]     # [2^0, 2^1]
//n = 2  ==> [1, 2, 4]  # [2^0, 2^1, 2^2]
public interface PowersOfTwo {
    static long[] powersOfTwo(int n) {
        long[] res = new long[n+1];
        for (int i = 0; i <= n; i++) {
            res[i]=res[i-1]*2;
        }
        return res;
    }
}
