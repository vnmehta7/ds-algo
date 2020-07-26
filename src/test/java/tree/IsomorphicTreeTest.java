package tree;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class IsomorphicTreeTest {


    @DisplayName("Isomorphic tree test")
    @Test
    public void testCorrectIsomorphicTree() {
        IsomorphicTree tree = new IsomorphicTree();

        // Let us create trees shown in above diagram
        tree.root1 = new TreeNode(1);
        tree.root1.left = new TreeNode(2);
        tree.root1.right = new TreeNode(3);
        tree.root1.left.left = new TreeNode(4);
        tree.root1.left.right = new TreeNode(5);
        tree.root1.right.left = new TreeNode(6);
        tree.root1.left.right.left = new TreeNode(7);
        tree.root1.left.right.right = new TreeNode(8);

        tree.root2 = new TreeNode(1);
        tree.root2.left = new TreeNode(3);
        tree.root2.right = new TreeNode(2);
        tree.root2.right.left = new TreeNode(4);
        tree.root2.right.right = new TreeNode(5);
        tree.root2.left.right = new TreeNode(6);
        tree.root2.right.right.left = new TreeNode(8);
        tree.root2.right.right.right = new TreeNode(7);

        Assert.assertTrue(tree.isIsomorphic(tree.root1, tree.root2));
    }
}
