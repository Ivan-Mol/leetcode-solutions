package leetcode;

import model.TreeNode;

public interface SameTree {
    static boolean isSameTree(TreeNode p, TreeNode q) {
        boolean res = true;
        while (p != null || q != null) {
            if (p == null || q == null || p.val != q.val) {
                return false;
            }
            res = isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            return res;
        }
        return true;
    }
}
