package tree;

public class BalanceBinaryTree {
    TreeNode root;

    boolean isBalanced(TreeNode treeNode) {
        if (treeNode == null) {
            return true;
        }
        int lh = height(treeNode.left);
        int rh = height(treeNode.right);

        return (Math.abs(lh - rh) <= 1
                && isBalanced(treeNode.left)
                && isBalanced(treeNode.right));
    }

    int height(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        return 1 + Math.max(height(treeNode.left), height(treeNode.right));
    }
}
