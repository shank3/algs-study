package leetcode.page2.p297;

import leetcode.TreeNode;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodecTest {

    @Test
    public void serialize() {
        Codec c = new Codec();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        String s = c.serialize(root);
//        System.out.println(s);
        assertEquals("1,2,null,null,3,4,null,null,5,null,null,", s);
    }

    @Test
    public void deserialize() {
        Codec c = new Codec();
        String s = new String("1,2,null,null,3,4,null,null,5,null,null,");
        TreeNode node = c.deserialize(s);
//        System.out.println(node);
        assertEquals(1, node.val);
    }
}