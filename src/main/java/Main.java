import codewars.CSVInterpretation;

public class Main {


    public static void main(String[] args) {
        String res = "0,1,2,3,45\n10,11,12,13,14\n20,21,22,23,24\n30,31,32,33,34";
        System.out.println(res);
        System.out.println(CSVInterpretation.toCsvText(new int[][]{
                {0, 1, 2, 3, 45},
                {10, 11, 12, 13, 14},
                {20, 21, 22, 23, 24},
                {30, 31, 32, 33, 34}}).equals(res));
    }
}
