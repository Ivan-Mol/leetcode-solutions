package codewars;

public interface SimpleFun {
    static int[] withdraw(int n) {
        int fifty = 0;
        if (n % 20 > 0) {
            fifty = 1;
            n -= 50;
        }
        return new int[]{n / 100, fifty, n % 100 / 20};
    }
}
//An ATM ran out of 10 dollar bills and only has 100, 50 and 20 dollar bills.
//
//Given an amount between 40 and 10000 dollars (inclusive) and assuming that the ATM wants to use as few bills as possible,
// determinate the minimal number of 100, 50 and 20 dollar bills the ATM needs to dispense (in that order).
//
//Example
//For n = 250, the result should be [2, 1, 0].
//
//For n = 260, the result should be [2, 0, 3].
//
//For n = 370, the result should be [3, 1, 1].