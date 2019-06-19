package leetcode.page3.p287;

/**
 * 287.寻找重复数
 */
public class Solution {
    public int findDuplicate(int[] nums) {
        int res = 0;
        for (int fast = 0; res != fast || fast == 0;) {
            res = nums[res];
            fast = nums[nums[fast]];
        }
        for (int i = 0; res != i; i = nums[i]) {
            res = nums[res];
        }
        return res;
    }
}
