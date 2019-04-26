import ds.TreeNode;

/**
 * Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
 * The binary search tree is guaranteed to have unique values.
 *
 * https://leetcode.com/problems/range-sum-of-bst/
 */
public class RangeSumBST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null)
            return 0;

        int sum = 0;
        sum += rangeSumBST(root.left, L, R);
        sum += rangeSumBST(root.right, L, R);
        if (root.val >= L && root.val <= R)
            sum += root.val;

        return sum;
    }
}
