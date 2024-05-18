package codewars;

//1,2,3,4,3,2,1
public interface EqualSidesOfArray {
    static int findEvenIndex(int[] arr) {
        // your code
        int frst = arr[0];
        int scnd = arr[arr.length - 1];

        int res = -1;
        if (frst != scnd) {
            return -1;
        }
        for (int i = 1; i < arr.length / 2; i++) {
            frst = frst + arr[i];
            scnd = scnd + arr[arr.length - i - 1];
            if (frst != scnd) {
                res = i;
                break;
            }
            res = i + 1;
        }
        return res;

    }
}