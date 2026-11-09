import java.util.*;

class Node {
    int val;
    List<Node> children;

    Node(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }
}

public class Problem2_3_LevelOrderTraversal {
    public static void levelOrder(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.val + " ");

            for (Node child : current.children) {
                queue.add(child);
            }
        }
    }
}
