package leetcode;

import model.TreeNode;

public interface InvertBinaryTree {
    static TreeNode invertTree(TreeNode root) {
        changeNodes(root);
        return root;
    }

    private static void changeNodes(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        changeNodes(node.left);
        changeNodes(node.right);
    }
}
