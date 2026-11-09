import java.util.*;

class Node {
    int val;
    List<Node> children;

    Node(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }
}

public class Problem5_2_MaxDepth {
    public static int maxDepth(Node root) {
        if (root == null) return 0;

        int maximumChildDepth = 0;
        for (Node child : root.children) {
            maximumChildDepth = Math.max(maximumChildDepth, maxDepth(child));
        }
        return 1 + maximumChildDepth;
    }
}
