package leetcode.page0.p011;

/**
 * 盛最多水的容器
 */
public class Solution {

    public int maxArea(int[] height) {
        int max = 0, l = 0, r = height.length - 1;
        while (l < r) {
            int s = (r - l) * (height[r] > height[l] ? height[l] : height[r]);
            if (height[r] > height[l]) {
                l++;
            } else {
                r--;
            }
            max = max < s ? s : max;
        }
        return max;
    }
}
