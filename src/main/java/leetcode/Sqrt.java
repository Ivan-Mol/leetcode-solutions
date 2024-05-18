package leetcode;

public interface Sqrt {
    static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        double t;
        double root = x / 2;
        do {
            t = root;
            root = (t + (x / t)) / 2;
        }
        while ((t - root) != 0);
        return (int) root;
    }
}
