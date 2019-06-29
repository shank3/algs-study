package leetcode.page4.p461;

/**
 * 461.汉明距离
 */
public class Solution {
    public int hammingDistance(int x, int y) {
//        return Integer.bitCount(x ^ y);
        int n = x ^ y;
        int d = 0;
        while (n != 0) {
            d++;
            n &= n - 1;
        }
        return d;
    }
}
