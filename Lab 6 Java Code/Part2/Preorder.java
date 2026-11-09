import java.util.*;

class Node {
    int val;
    List<Node> children;

    Node(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }
}

public class Problem2_1_PreorderTraversal {
    public static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        for (Node child : root.children) {
            preorder(child);
        }
    }
}
