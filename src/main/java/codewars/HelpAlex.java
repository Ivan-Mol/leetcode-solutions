package codewars;

public interface HelpAlex {
    static String hoopCount(int n) {
        if (n > 9) {
            return "Great, now move on to tricks";
        } else {
            return "Keep at it until you get it";
        }
    }
}
