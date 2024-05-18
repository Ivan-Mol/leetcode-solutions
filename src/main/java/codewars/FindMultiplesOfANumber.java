package codewars;

//(new int[] { 5, 10, 15, 20, 25 }, Multiples.find(5, 25), "Testing for base=5 and limit=25");
public interface FindMultiplesOfANumber {
    public static int[] find(int base, int limit) {
        int[] res = new int[limit / base];
        int counter = 0;
        for (int i = 0; i < limit / base; i++) {
            counter = counter + base;
            res[i] = counter;
        }
        return res;
    }
}