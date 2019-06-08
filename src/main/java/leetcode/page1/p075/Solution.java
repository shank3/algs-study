package leetcode.page1.p075;

/**
 * 75荷兰国旗问题
 */
public class Solution {
    //0-红 1-白 2-蓝
    public void sortColors(int[] nums) {
        int red_right = 0, cur = 0, blue_left = nums.length-1;
        int tmp = -1;
        while (cur <= blue_left) {
            if (nums[cur] == 0) {
                tmp = nums[cur];
                nums[cur] = nums[red_right];
                nums[red_right] = tmp;
                cur++;
                red_right++;
            } else if (nums[cur] == 2) {
                tmp = nums[cur];
                nums[cur] = nums[blue_left];
                nums[blue_left] = tmp;
                blue_left--;
            } else {
                cur++;
            }
        }
    }
}
