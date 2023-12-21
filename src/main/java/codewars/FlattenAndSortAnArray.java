package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public interface FlattenAndSortAnArray {
    static int[] flattenAndSort(int[][] array) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                integers.add(array[i][j]);
            }

        }
        return integers.stream().mapToInt(i -> i).sorted().toArray();
    }
}
