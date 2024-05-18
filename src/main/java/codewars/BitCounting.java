package codewars;

public interface BitCounting {

    static int countBits(int n) {
        return Integer.toBinaryString(n).chars().map(Character::getNumericValue).sum();
    }

}