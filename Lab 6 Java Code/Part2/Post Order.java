import java.util.*;

class Node {
    int val;
    List<Node> children;

    Node(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }
}

public class Problem2_2_PostorderTraversal {
    public static void postorder(Node root) {
        if (root == null) return;

        for (Node child : root.children) {
            postorder(child);
        }
        System.out.print(root.val + " ");
    }
}
