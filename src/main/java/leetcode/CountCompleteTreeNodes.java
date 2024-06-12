package leetcode;

import nodes.TreeNode;

public interface CountCompleteTreeNodes {
    static int countNodes(TreeNode root) {
        if (root != null) {
            return 1 + countNodes(root.left) + countNodes(root.right);
        } else {
            return 0;
        }
    }

    static int countNode2(TreeNode root) {
        return root == null ? 0 : 1 + countNodes(root.left) + countNodes(root.right);
    }
}
