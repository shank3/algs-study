package leetcode.p048;

/**
 * 48.旋转头像
 */
public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n/2; i++) {
            for (int j = i; j < n-i-1; j++) {
                int t = matrix[i][j];
                matrix[i][n-j-1] = matrix[i][j];
                matrix[i][n-j-1] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = t;
            }
        }
    }
}
