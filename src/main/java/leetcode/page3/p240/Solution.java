package leetcode.page3.p240;

import java.util.Arrays;

/**
 * 240.搜索二维矩阵
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix.length;
        if (len == 0) return false;
        int i = 0,j = matrix[0].length - 1;
        while (i < len && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
