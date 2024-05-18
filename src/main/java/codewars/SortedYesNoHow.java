package codewars;

//Complete the method which accepts an array of integers, and returns one of the following:
//
//"yes, ascending" - if the numbers in the array are sorted in an ascending order
//"yes, descending" - if the numbers in the array are sorted in a descending order
//"no" - otherwise
//You can assume the array will always be valid, and there will always be one correct answer.
public interface SortedYesNoHow {
    public static String isSortedAndHow(int[] array) {
        if (array.length > 1 && array[0] < array[1]) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    return "no";
                }
            }
            return "yes, ascending";
        }
        if (array.length > 1 && array[0] > array[1]) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    return "no";
                }
            }
            return "yes, descending";
        }
        return "no";
    }
}
