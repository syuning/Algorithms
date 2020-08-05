package main.java.tree;

import java.util.*;

public class BinaryTree {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightView = new ArrayList<>();
        if (root != null) {
            rightView.add(root.val);
            while (root.left != null || root.right != null){
                if (root.right == null) {
                    rightView.add(root.left.val);
                    root = root.left;
                } else if (root.left == null) {
                    rightView.add(root.right.val);
                    root = root.right;
                } else {
                    rightView.add(root.right.val);
                    if (root.right.right == null && root.right.left == null && (root.left.left != null || root.left.right != null)) {
                        root = root.left;
                    } else {
                        root = root.right;
                    }
                }
            }
        }
        return rightView;
    }

}
