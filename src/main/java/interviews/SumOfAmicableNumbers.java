package interviews;

public class SumOfAmicableNumbers {
        public static void main(String[] args) {
            long sum = 0;
            for (int i = 1; i < 10000; i++) {
                int firstNumber = sum(i);
                int secondNumber = sum(firstNumber);
                if (secondNumber == i && i < firstNumber) {
                    sum = sum + i + firstNumber;
                }
            }
            System.out.println(sum);
        }

        private static int sum(int input) {
            int sum = 0;
            for (int i = 1; i <= input/2; i++) {
                if (input % i == 0) {
                    sum = sum+i;
                }
            }
            return sum;
        }
}
