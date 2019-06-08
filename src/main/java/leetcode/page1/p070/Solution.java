package leetcode.page1.p070;

/**
 * 70. 爬楼梯
 */
public class Solution {

    public int climbStairs(int n) {
        if (n < 4) return n;
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 2;
        for (int i = 2; i < n; i++) {
            a[i] = a[i-1] + a[i-2];
        }
        return a[n-1];
    }
}
