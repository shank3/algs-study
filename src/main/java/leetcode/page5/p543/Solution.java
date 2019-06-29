package leetcode.page5.p543;

import leetcode.TreeNode;

/**
 * 543.二叉树的直径
 */
public class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        return maxDep(root);
    }

    private int maxDep(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDep(root.left);
        int right = maxDep(root.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
}
