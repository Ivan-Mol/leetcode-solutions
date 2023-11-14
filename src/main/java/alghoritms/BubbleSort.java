package alghoritms;

public interface BubbleSort {
    static Integer[] bubbleSort(Integer[] arr) {
        if (arr.length==0) {
            return arr;
        }
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted=false;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
}
