import ds.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlipEqBinTreeTest {
    FlipEqBinTree flipEqBinTree = new FlipEqBinTree();

    @Test
    public void flipTest() {
        TreeNode tn1 = new TreeNode(1);
        tn1.right = new TreeNode(3);
        tn1.right.left = new TreeNode(6);
        tn1.left = new TreeNode(2);
        tn1.left.left = new TreeNode(4);
        tn1.left.right = new TreeNode(5);
        tn1.left.right.left = new TreeNode(7);
        tn1.left.right.right = new TreeNode(8);

        TreeNode tn2 = new TreeNode(1);
        tn2.left = new TreeNode(3);
        tn2.left.right = new TreeNode(6);
        tn2.right = new TreeNode(2);
        tn2.right.left = new TreeNode(4);
        tn2.right.right = new TreeNode(5);
        tn2.right.right.left = new TreeNode(7);
        tn2.right.right.right = new TreeNode(8);

        assertTrue(flipEqBinTree.flipEquiv(tn1, tn2));
    }

}