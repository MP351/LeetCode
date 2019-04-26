import ds.TreeNode;

/**
 * For a binary tree T, we can define a flip operation as follows: choose any node, and swap the left and right child subtrees.
 * A binary tree X is flip equivalent to a binary tree Y if and only if we can make X equal to Y after some number of flip operations.
 * Write a function that determines whether two binary trees are flip equivalent.  The trees are given by root nodes root1 and root2.
 *
 * https://leetcode.com/problems/flip-equivalent-binary-trees/
 */

public class FlipEqBinTree {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        //FIXME: NPE
        if (root1 == null || root2 == null)
            return false;

        boolean flip = true;

        if (root1.val != root2.val)
            return false;
        if (root1.right == root2.right && root1.right != null) {
            if (!flipEquiv(root1.right, root2.right))
                return false;

        }
        if (root1.left.val == root2.left.val && root1.right.val == root2.right.val) {
            if (!flipEquiv(root1.left, root2.left))
                return false;
            if (!flipEquiv(root2.right, root2.right))
                return false;
        } else if (root1.left.val == root2.right.val && root1.right.val == root1.left.val) {
            if (!flipEquiv(root1.left, root2.right))
                return false;
            if (!flipEquiv(root1.right, root2.left))
                return false;
        }
        return flip;
    }
}
