package codewars;

public interface BinaryAddition {
    public static String binaryAddition(int a, int b){
        //your code here
        return Integer.toBinaryString(a+b);
    }
}
//1, 1 --> "10" (1 + 1 = 2 in decimal or 10 in binary)
//5, 9 --> "1110" (5 + 9 = 14 in decimal or 1110 in binary)
