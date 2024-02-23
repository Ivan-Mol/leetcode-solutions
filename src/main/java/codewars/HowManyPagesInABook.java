package codewars;

public class HowManyPagesInABook {

    public static int amountOfPages(int summary) {
        int sum = 0;
        int iter = 1;
        while (summary!=sum){
            sum = sum+Integer.toString(iter).length();
            iter++;
        }
        return iter-1 ;
    }

}