package leetcode.page4.p437;

import leetcode.TreeNode;

/**
 * 437.路径总和Ⅲ
 */
public class Solution {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        res += find(root, sum);
        res += pathSum(root.left, sum);
        res += pathSum(root.right, sum);
        return res;
    }

    private int find(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        if (root.val == sum) {
            res += 1;
        }
        res += find(root.left, sum - root.val);
        res += find(root.right, sum - root.val);
        return res;
    }
}
