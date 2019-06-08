package leetcode.page2.p102;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 102.二叉树的层次遍历
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> rtn = new ArrayList<List<Integer>>();
        if (root == null) {
            return rtn;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> cur = new ArrayList<Integer>();
            int count = queue.size();
            while (count > 0) {
                TreeNode poll = queue.poll();
                cur.add(poll.val);
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
                count--;
            }
            rtn.add(cur);
        }
        return rtn;
    }
}
