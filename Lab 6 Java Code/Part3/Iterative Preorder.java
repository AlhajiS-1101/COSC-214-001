import java.util.*;

class Node {
    int val;
    List<Node> children;

    Node(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }
}

public class Problem3_1_IterativePreorder {
    public static void iterativePreorder(Node root) {
        if (root == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.val + " ");

            for (int i = current.children.size() - 1; i >= 0; i--) {
                stack.push(current.children.get(i));
            }
        }
    }
}
