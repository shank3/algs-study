package leetcode.page0.p084;

/**
 * 84.柱状图中的最大矩形
 */
public class Solution {

    public int largestRectangleArea(int[] heights) {
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            if (i+1 == heights.length || heights[i] > heights[i+1]) {
                int maxArea = 0;
                int minHeight = heights[i];
                for (int j = i; j >= 0; j--) {
                    minHeight = Math.min(minHeight, heights[j]);
                    maxArea = Math.max(maxArea, (i-j+1) * minHeight);
                }
                max = Math.max(max, maxArea);
            }
        }
        return max;
    }
}
