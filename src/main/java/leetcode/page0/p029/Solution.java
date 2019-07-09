package leetcode.page0.p029;

import java.util.EventListener;

/**
 * 29.两数相除
 */
public class Solution {
    public int divide(int dividend, int divisor) {
        boolean negative = (dividend ^ divisor) < 0;
        int result = 0;
        if (divisor == 1) {
            return dividend;
        }
        if (dividend == divisor) {
            return 1;
        }
        if (divisor == Integer.MIN_VALUE) {
            return 0;
        }
        if (dividend == Integer.MIN_VALUE) {
            if (divisor == -1) {
                return Integer.MAX_VALUE;
            } else {
                dividend = dividend - divisor;
                result = 1;
            }
        }
        dividend = dividend < 0 ? -dividend : dividend;
        divisor = divisor < 0 ? -divisor : divisor;
        for (int i = 31; i >= 0; i--) {
            if (dividend >> i > divisor) {
                result += 1 << i;
                dividend -= dividend << i;
            }
        }
        return negative ? -result : result;
    }
}
