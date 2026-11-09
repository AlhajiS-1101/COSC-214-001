class BNode {
    int val;
    BNode left;
    BNode right;

    BNode(int val) {
        this.val = val;
    }
}

public class Problem4_3_CheckBalancedTree {
    public static boolean isBalanced(BNode root) {
        return checkHeight(root) != -1;
    }

    // Returns -1 when an unbalanced subtree is found.
    public static int checkHeight(BNode root) {
        if (root == null) return 0;

        int leftHeight = checkHeight(root.left);
        if (leftHeight == -1) return -1;

        int rightHeight = checkHeight(root.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
