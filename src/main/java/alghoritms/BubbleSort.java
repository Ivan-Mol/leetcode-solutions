package alghoritms;

public interface BubbleSort {
    static int[] bubbleSort(int[] arr) {
        boolean isSorted = true;
        while (isSorted) {
            isSorted = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    isSorted = true;
                }
            }
        }
        return arr;
    }
}
