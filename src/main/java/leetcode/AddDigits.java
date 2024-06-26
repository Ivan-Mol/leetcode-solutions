package leetcode;

public interface AddDigits {
    static int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        return addDigits(num / 10 + num % 10);
    }
}
