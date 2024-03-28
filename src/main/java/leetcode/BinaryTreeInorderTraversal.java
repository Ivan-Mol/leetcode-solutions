package leetcode;

import model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
interface BinaryTreeInorderTraversal {
    List<Integer> result = new ArrayList<>();
    static List<Integer> inorderTraversal(TreeNode root) {
        TreeNode node = root;
        if(root!=null){
            inorderTraversal(node.left);
            result.add(node.val);
            inorderTraversal(node.right);
        }
        return result;
    }
}