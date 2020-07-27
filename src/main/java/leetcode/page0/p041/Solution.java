package leetcode.page0.p041;

/**
 * 41.缺失的第一个正数
 */
public class Solution {

    /**
     * 遍历一次数组把大于等于1的和小于数组大小的值放到原数组对应位置，
     * 然后再遍历一次数组查当前下标是否和值对应，
     * 如果不对应那这个下标就是答案，否则遍历完都没出现那么答案就是数组长度加1。
     * @param nums
     * @return
     */
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            while (0 < nums[i] && nums[i] <= len && nums[i] != nums[nums[i] - 1]) {
                int tmp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = tmp;
            }
        }
        int i = 0;
        while (i < len && nums[i] == i+1) {
             i++;
        }
        return i + 1;
    }

}
