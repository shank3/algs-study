package leetcode.page0.p079;

/**
 * 79.单词搜索
 */
public class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (word.charAt(0) == board[i][j] && backtrack(i, j, 0, word, board, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtrack(int i, int j, int index, String word, char[][] board, boolean[][] visited) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || visited[i][j] || word.charAt(index) != board[i][j]) {
            return false;
        }
        visited[i][j] = true;
        if (backtrack(i+1, j, index+1, word, board, visited) || backtrack(i-1, j, index+1, word, board, visited)
            || backtrack(i, j-1, index+1, word, board, visited) || backtrack(i, j+1, index+1, word, board, visited)) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}
