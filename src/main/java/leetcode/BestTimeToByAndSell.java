package leetcode;

import java.io.FilterOutputStream;

//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//Example 2:
//2,4,1 -> 2
public interface BestTimeToByAndSell {
    static int maxProfit(int[] prices) {
        int min = prices[0];
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]<min){
                min = prices[i];
            } else if (prices[i]-min>result) {
                result = prices[i]-min;
            }
        }
        return result;
    }
}
