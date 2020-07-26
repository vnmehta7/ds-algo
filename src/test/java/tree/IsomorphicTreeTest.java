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
        tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);
        tree.root1.left.left = new Node(4);
        tree.root1.left.right = new Node(5);
        tree.root1.right.left = new Node(6);
        tree.root1.left.right.left = new Node(7);
        tree.root1.left.right.right = new Node(8);

        tree.root2 = new Node(1);
        tree.root2.left = new Node(3);
        tree.root2.right = new Node(2);
        tree.root2.right.left = new Node(4);
        tree.root2.right.right = new Node(5);
        tree.root2.left.right = new Node(6);
        tree.root2.right.right.left = new Node(8);
        tree.root2.right.right.right = new Node(7);

        Assert.assertTrue(tree.isIsomorphic(tree.root1, tree.root2));
    }
}
