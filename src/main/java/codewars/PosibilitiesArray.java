package codewars;

import java.util.Arrays;

public interface PosibilitiesArray {
    static boolean isAllPossibilities(int[] arg) {
        System.out.println(Arrays.toString(arg));
        if (arg==null||arg.length==0){
            return false;
        }
        boolean isValid = false;
        for (int i = 0; i < arg.length ; i++) {
            if (arg[i]==0){
                isValid = true;
            }
            if (arg[i]>arg[arg.length-1]){
                System.out.println(arg[i]);
                System.out.println(arg[arg.length-1]);
                isValid = false;
                return isValid;
            }
        }
        return isValid;
    }
}
