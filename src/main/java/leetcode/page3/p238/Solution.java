package leetcode.page3.p238;

/**
 * 238.除自身外数组的乘机
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prod = new int[nums.length];
        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            prod[i] = k;
            k = k * nums[i];
        }
        k = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            prod[i] *= k;
            k *= nums[i];
        }
        return prod;
    }
}
