package leetcode.page4.p337;

import leetcode.TreeNode;

/**
 * 337.打家劫舍
 */
public class Solution {
    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int x = rob(root.left) + rob(root.right);
        int y = root.val;
        if (root.left != null) {
            y += rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null) {
            y += rob(root.right.left) + rob(root.right.right);
        }
        return Math.max(x, y);
    }
}
