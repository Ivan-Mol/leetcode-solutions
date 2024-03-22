package leetcode;

import java.sql.Time;
import java.util.Locale;

//7, 1, 5, 3, 6, 4
public interface BestTimeToBuyAndSell_II {
    static int maxProfit(int[] prices) {
        int res = 0;
        int prev = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prev<prices[i]) {
                res = res + prices[i]-prev;
            }
            prev = prices[i];
        }
        return res;
    }
}
