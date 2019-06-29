package leetcode.page5.p538;

import leetcode.TreeNode;

/**
 * 538.把二叉搜索树转换为累加树
 */
public class Solution {
    public TreeNode convertBST(TreeNode root) {
        rdl(root, 0);
        return root;
    }

    private int rdl(TreeNode root, int i) {
        if (root == null) {
            return i;
        }
        int right = rdl(root.right, i);
        root.val += right;
        int left = rdl(root.left, root.val);
        return left;
    }
}
