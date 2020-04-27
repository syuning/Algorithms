package test.java.tree;

import main.java.tree.BinaryTree;
import main.java.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeTest {

    @Test
    public void rightSideViewTest1() {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        root.setRight(null);
        root.setLeft(left);
        assertEquals((Integer)1, tree.rightSideView(root).get(0));
        assertEquals((Integer)2, tree.rightSideView(root).get(1));
    }

    @Test
    public void rightSideViewTest2() {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);
        TreeNode left2 = new TreeNode(4);
        root.setLeft(left1);
        root.setRight(right1);
        left1.setLeft(left2);
        assertEquals((Integer)1, tree.rightSideView(root).get(0));
        assertEquals((Integer)3, tree.rightSideView(root).get(1));
        assertEquals((Integer)4, tree.rightSideView(root).get(2));
    }
}
