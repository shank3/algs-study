package leetcode.page3.p283;

/**
 * 283.移动零
 */
public class Solution {


    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public void moveZeroes1(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                int j = i+1;
                while (j < nums.length - 1) {
                    if (nums[j] != 0) {
                        break;
                    } else {
                        j++;
                    }
                }
                int t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
            }
        }
    }
}
