package leetcode;


import nodes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public interface BinaryTreePostorderTraversal {
    static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ints = new ArrayList<>();
        addNums(root, ints);
        return ints;
    }

    static void addNums(TreeNode root, List<Integer> ints) {
        if (root != null) {
            addNums(root.left, ints);
            addNums(root.right, ints);
            ints.add(root.val);
        }
    }
}
