package interviews;

import java.math.BigInteger;

public class SumOfDigits {
        public static void main(String[] args) {
            BigInteger base = BigInteger.valueOf(2);
            BigInteger power = BigInteger.valueOf(1000);
            BigInteger result = base.pow(power.intValue());
            String numStr = result.toString();
            int sum = 0;
            for (int i = 0; i < numStr.length(); i++) {
                sum += Character.getNumericValue(numStr.charAt(i));
            }
            System.out.println("The sum of the digits of 2^1000 is: " + sum);
        }


}
