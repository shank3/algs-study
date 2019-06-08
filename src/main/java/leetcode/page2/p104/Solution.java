package leetcode.page2.p104;

import leetcode.TreeNode;

/**
 * 104.二叉树的最大深度
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
