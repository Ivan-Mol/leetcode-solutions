package leetcode;

import nodes.TreeNode;

public interface ConvertSortedArrayToBinaryTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    //Input: nums = [-10,-3,0,5,9]
    //Output: [0,-3,9,-10,null,5]
    //Explanation: [0,-10,5,null,-3,null,9] is also accepted:
//TODO
    static TreeNode sortedArrayToBST(int[] nums) {
        return new TreeNode();
    }

}
