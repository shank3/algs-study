package leetcode.p048;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void rotate() {
        int x = 1;
        int n = 3;
        int[][] matrix = new int[3][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = x++;
            }
        }
        Solution s = new Solution();
        s.rotate(matrix);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}