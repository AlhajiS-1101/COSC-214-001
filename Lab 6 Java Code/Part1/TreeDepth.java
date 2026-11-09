import java.util.ArrayList;
import java.util.List;

public class TreeDepth {
    static class Node {
        int val;
        List<Node> children;
        Node(int val) {
            this.val = val;
            this.children = new ArrayList<>();
        }
    }

    static int height(Node root) {
        if (root == null) return 0;
        int maxHeight = 0;
        for (Node child : root.children) {
            maxHeight = Math.max(maxHeight, height(child));
        }
        return 1 + maxHeight;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        root.children.add(node2);
        root.children.add(node3);
        root.children.add(node4);
        node3.children.add(node5);
        node3.children.add(node6);

        System.out.println("Tree Height: " + height(root)); // Output: 3
    }
}
