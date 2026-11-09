class BNode {
    int val;
    BNode left;
    BNode right;

    BNode(int val) {
        this.val = val;
    }
}

public class Problem4_2_InorderTraversal {
    public static void inorder(BNode root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}
