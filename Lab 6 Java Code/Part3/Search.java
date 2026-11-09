import java.util.*;

class Node {
    int val;
    List<Node> children;

    Node(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }
}

public class Problem3_3_SearchTree {
    public static boolean search(Node root, int target) {
        if (root == null) return false;
        if (root.val == target) return true;

        for (Node child : root.children) {
            if (search(child, target)) return true;
        }
        return false;
    }
}
