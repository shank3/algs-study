package leetcode.p004;

public class Solution {
    /**
     * 寻找两个有序数组的中位数
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length, left = (m + n + 1)/2, right = (m+n+2)/2;
        return (findKth(nums1, 0, nums2, 0, left) + findKth(nums1, 0, nums2, 0, right))/2;
    }

    private double findKth(int[] nums1, int i, int[] nums2, int j, int k) {
        if (i >= nums1.length) {
            return nums2[j + k - 1];
        }
        if (j >= nums2.length) {
            return nums1[i + k -1];
        }
        if (k == 1) {
            return Math.min(nums1[i + k -1], nums2[j + k -1]);
        }
        int mid1 = i + k/2 - 1 < nums1.length ? nums1[i+k/2-1] : Integer.MAX_VALUE;
        int mid2 = j + k/2 - 1 < nums2.length ? nums2[j+k/2-1] : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth(nums1, i+k/2, nums2, j, k - k/2);
        } else {
            return findKth(nums1, i, nums2, j + k/2, k -k/2);
        }

    }
}
