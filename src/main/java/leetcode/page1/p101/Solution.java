package leetcode.page1.p101;

import leetcode.TreeNode;

/**
 * 101.对称二叉树
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return (left.val == right.val) &&
                isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
