package leetcode.contest.p1089;

/**
 * 1089.复写零
 */
public class Solution {
    public void duplicateZeros(int[] arr) {
        int j = 0, len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) {
                for (j = len - 1; j > i; j--) {
                    arr[j] = arr[j-1];
                }
                if (i + 1 < len) {
                    arr[++i] = 0;
                }
            }
        }
    }
}
