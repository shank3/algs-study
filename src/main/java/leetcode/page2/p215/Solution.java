package leetcode.page2.p215;

/**
 * 215.数组中第k个最大元素
*/
public class Solution {

    public int findKthLargest(int[] nums, int k) {
        int low = 0, high = nums.length - 1, mid = 0;
        while (low <= high) {
            mid = partition(nums, low, high);
            if (mid == k - 1) {
                return nums[mid];
            } else if (mid > k - 1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private int partition(int[] nums, int low, int high) {
        int left = low + 1, right = high;
        swap(nums, low, (low + high) / 2);
        int pivot = nums[low];
        while (left <= right) {
            while (left < high && nums[left] >= pivot) left++;
            while (nums[right] < pivot) right--;
            if (left < right) {
                swap(nums, left++, right--);
            } else {
                break;
            }
        }
        swap(nums, low, right);
        return right;
    }

    private void swap(int[] nums, int low, int i) {
        int x = nums[low];
        nums[low] = nums[i];
        nums[i] = x;
    }

}
