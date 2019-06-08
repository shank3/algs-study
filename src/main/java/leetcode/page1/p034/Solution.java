package leetcode.page1.p034;

/**
 * 34.在排序数组中查找元素的开始和结束位置
 */
public class Solution {

    public int[] searchRange(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1, start = -1, end = -1;
        int midddle = -1;
        while (lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if (nums[mid] < target) {
                lo = mid + 1;
            } else if (nums[mid] == target) {
                midddle =  mid;
                break;
            } else {
                hi = mid - 1;
            }
        }
        if (midddle != -1) {
            start = midddle;
            while (start - 1 >= 0 && nums[start-1] == target) {
                start--;
            }
            end = midddle;
            while (end + 1 < nums.length && nums[end+1] == target) {
                end++;
            }
        }
        return new int[]{start,end};
    }
}
