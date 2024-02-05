package alghoritms;

public interface BubbleSort {
    static int[] bubbleSort(int[] arr) {
        if (arr.length==0){
            return arr;
        }
        boolean isSorted = false;
        while (!isSorted){
            isSorted=true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1]>arr[i]){
                    isSorted = false;
                    int temp = arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
