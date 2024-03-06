package leetcode;


import model.TreeNode;

import java.util.*;

public interface BinaryTreePreorderTraversal {
    static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ints = new ArrayList<>();
        addNums(root,ints);
        return ints;
    }
    static void addNums(TreeNode root, List<Integer> ints){
        if(root!=null){
            ints.add(root.val);
            addNums(root.left,ints);
            addNums(root.right,ints);
        }
    }
}
