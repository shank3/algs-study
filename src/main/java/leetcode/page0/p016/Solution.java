package leetcode.page0.p016;

import java.util.Arrays;

/**
 * 16. 最接近的三数之和
 */
public class Solution {


    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(sum - target) < Math.abs(ans - target)) {
                    ans = sum;
                }
                if (sum > target) {
                    r--;
                } else if (sum == target) {
                    return sum;
                } else {
                    l++;
                }
            }
        }
        return ans;
    }

}
