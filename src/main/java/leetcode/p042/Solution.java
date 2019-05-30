package leetcode.p042;

/**
 * 42.接雨水
 */
public class Solution {
    public int trap(int[] height) {
        if (height == null || height.length < 3) return 0;
        int lo = 0, left = height[0], hi = height.length - 1, right = 0;
        int max = 0;
        while (lo < hi) {
            if (height[lo] < height[hi]) {
                if (height[lo] < left) {
                    max += left - height[lo];
                } else {
                    left = height[lo];
                }
                lo++;
            } else {
                if (height[hi] < right) {
                    max += right - height[hi];
                } else {
                    right = height[hi];
                }
                hi--;
            }
        }
        return max;
    }
}
