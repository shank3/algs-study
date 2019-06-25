package leetcode.page2.p200;

/**
 * 200.岛屿数量
 */
public class Solution {

    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        int sum = 0;
        int row = grid.length, col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    sum++;
                    bfs(i, j, grid);
                }
            }
        }
        return sum;
    }

    private void bfs(int i, int j, char[][] grid) {
        if (i < 0 || i >= grid.length) return;
        if (j < 0 || j >= grid[0].length) return;
        if (grid[i][j] == '1') {
            grid[i][j] = '0';
            bfs(i+1, j, grid);
            bfs(i, j+1, grid);
            bfs(i-1, j, grid);
            bfs(i, j-1, grid);
        }
    }

}
