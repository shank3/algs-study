package leetcode.p011;

/**
 * 盛最多水的容器
 */
public class Solution {

    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i <= height.length - 2; i++) {
            for (int j = i+1; j < height.length; j++) {
                int s = (j - i) * (height[j] > height[i] ? height[i] : height[j]);
                max = max < s ? s : max;
            }
        }
        return max;
    }
}
