package leetcode.page2.p121;

/**
 * 121.买卖股票的最佳时机
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int max = 0, min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);

        }
        return max;
    }
}
