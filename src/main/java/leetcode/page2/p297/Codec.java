package leetcode.page2.p297;

import leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 297.二叉树的序列化和反序列化
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "null,";
        }
        StringBuilder sb = new StringBuilder(root.val + ",");
        sb.append(serialize(root.left));
        sb.append(serialize(root.right));
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] split = data.split(",");
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < split.length; i++) {
            queue.add(split[i]);
        }
        return pre(queue);
    }

    private TreeNode pre(Queue<String> queue) {
        String poll = queue.poll();
        if (poll == null) {
            return null;
        }
        if (poll.equals("null")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(poll));
        root.left = pre(queue);
        root.right = pre(queue);
        return root;
    }

}
