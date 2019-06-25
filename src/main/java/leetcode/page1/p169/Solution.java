package leetcode.page1.p169;

/**
 * 169.求众数
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int count = 1, maj = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == maj) {
                count++;
            } else {
                if (--count == 0) {
                    maj = nums[i + 1];
                }
            }
        }
        return maj;
    }
}
