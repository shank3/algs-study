package leetcode.page1.p124;

import leetcode.TreeNode;

/**
 * 124.二叉树中的最大路径和
 */
public class Solution {
    int ret = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        getMax(root);
        return ret;
    }

    private int getMax(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, getMax(root.left));
        int right = Math.max(0, getMax(root.right));
        ret = Math.max(ret, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}
