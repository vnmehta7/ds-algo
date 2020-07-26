package tree;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class BalanceBinaryTreeTest {

    @DisplayName("Non balanced tree test")
    @Test
    public void testNonBalancedTree() {
        BalanceBinaryTree tree = new BalanceBinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.left.left.left = new TreeNode(8);
        Assert.assertFalse("Tree is not balanced", tree.isBalanced(tree.root));
    }

    @DisplayName("Balanced tree test")
    @Test
    public void testBalancedTree() {
        BalanceBinaryTree tree = new BalanceBinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        Assert.assertTrue("Tree is  balanced", tree.isBalanced(tree.root));
    }
}
