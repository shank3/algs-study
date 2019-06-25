package leetcode.page0.p098;

import leetcode.TreeNode;

/**
 * 98.验证二叉搜索树
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isBST(root, null, null);
    }

    private boolean isBST(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        if ((min != null && root.val <= min) || (max != null && root.val >= max)) return false;
        return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
    }
}
