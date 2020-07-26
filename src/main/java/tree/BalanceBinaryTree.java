package tree;

public class BalanceBinaryTree {
    Node root;

    boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }
        int lh = height(node.left);
        int rh = height(node.right);

        return (Math.abs(lh - rh) <= 1
                && isBalanced(node.left)
                && isBalanced(node.right));
    }

    int height(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }
}
