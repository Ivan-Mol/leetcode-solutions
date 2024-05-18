package codewars;

public interface OppositesAttract {
    static boolean isLove(final int flower1, final int flower2) {
        return Math.abs(flower1 - flower2) % 2 != 0;
    }
}
