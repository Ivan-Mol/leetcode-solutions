package leetcode;

import model.TreeNode;

public interface MaximumDepthOfBinaryTree {
    static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

}