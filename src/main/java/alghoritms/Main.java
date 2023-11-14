package alghoritms;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put(null, null);
        Integer[] arr = new Integer[60];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(arr)));
        System.out.println(BinarySearch.binarySearch(arr, 42));
        TreeSet<Integer> treeSet = new TreeSet<>(List.of(arr));
        System.out.println(treeSet.ceiling(12));
    }
}
