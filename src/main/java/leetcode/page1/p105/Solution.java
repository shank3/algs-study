package leetcode.page1.p105;

import leetcode.TreeNode;

/**
 * 105.从前序与中序遍历序列构造二叉树
 */
public class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int[] inorder, int preStart, int inStart, int inEnd) {
        if (inStart > inEnd) return null;
        int cur = preorder[preStart];
        int inIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == cur) {
                inIndex = i;
                break;
            }
        }
        TreeNode current = new TreeNode(cur);
        current.left = build(preorder, inorder, preStart + 1, inStart, inIndex - 1);
        current.right = build(preorder, inorder, preStart + inIndex - inStart + 1, inIndex + 1, inEnd);
        return current;
    }

}
