package codewars;

public interface TransportationOnVacation {
    static int rentalCarCost(int d) {
        int res = 0;
        for (int i = 0; i < d; i++) {
            res = res + 40;
        }
        if (d > 2 && d < 7) {
            res = res - 20;
        }
        if (d > 6) {
            res = res - 50;
        }
        return res;
    }

}
