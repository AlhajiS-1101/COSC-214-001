import java.util.*;

class Node {
    int val;
    List<Node> children;

    Node(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }
}

public class Problem3_2_FindMaximumValue {
    public static int findMax(Node root) {
        if (root == null) return Integer.MIN_VALUE;

        int maximum = root.val;
        for (Node child : root.children) {
            maximum = Math.max(maximum, findMax(child));
        }
        return maximum;
    }
}
