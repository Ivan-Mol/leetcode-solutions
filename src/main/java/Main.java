import interviews.Flowers;

import java.util.concurrent.Flow;

public class Main {
    public static void main(String[] args) {
        long startMillis = System.nanoTime();
        System.out.println(Flowers.canPlaceFlowers(new int[]{0,0,0},2));
        //System.out.println(System.nanoTime() - startMillis);
    }
}