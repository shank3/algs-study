package leetcode.page3.p239;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 239.滑动窗口的最大值
 */
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return nums;
        }
        int len = nums.length;
        int[] result = new int[len - k + 1];
        Deque<Integer> window = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            while (!window.isEmpty() && nums[window.peekLast()] < nums[i]) {
                window.pollLast();
            }
            window.addLast(i);
            if (i >= k - 1) {
                result[i-k+1] = i - window.peek() >= k -1 ? nums[window.poll()] : nums[window.peek()];
            }
        }
        return result;
    }
}
