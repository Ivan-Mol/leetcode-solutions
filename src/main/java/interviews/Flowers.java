package interviews;

import java.util.Arrays;

public interface Flowers {
    Integer getNum();
    static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        if (flowerbed.length == 1 && flowerbed[0] == 0 && n <= 1) {
            return true;
        }
        for (int i = 1; i < flowerbed.length; i++) {
            if (i == 1 && flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                flowerbed[i - 1] = 1;
                n = n - 1;
                if (n == 0) {
                    System.out.println(Arrays.toString(flowerbed));
                    return true;
                }
            }
            if (i == flowerbed.length - 2 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i + 1] = 1;
                n = n - 1;
                if (n == 0) {
                    System.out.println(Arrays.toString(flowerbed));
                    return true;
                }
            }
            if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n = n - 1;
                if (n == 0) {
                    System.out.println(Arrays.toString(flowerbed));
                    return true;
                }
            }
        }
        return false;
    }
}