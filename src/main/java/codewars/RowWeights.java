package codewars;

public interface RowWeights {
    static int[] rowWeights(final int[] weights) {
        int[] res = new int[2];
        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                res[0] = res[0] + weights[i];
            } else {
                res[1] = res[1] + weights[i];

            }
        }
        return res;
    }
}
