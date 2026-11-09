import java.util.*;

class Node {
    int val;
    List<Node> children;

    Node(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }
}

public class SampleTree {
    public static Node buildSampleTree() {
        Node root = new Node(1);
        Node child1 = new Node(2);
        Node child2 = new Node(3);
        Node child3 = new Node(4);

        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);

        return root;
    }

    public static void printTreeLevelOrder(Node root) {
        if (root == null) return;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.print("Node " + curr.val + " children: ");
            for (Node child : curr.children) {
                System.out.print(child.val + " ");
                queue.add(child);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node treeRoot = buildSampleTree();
        printTreeLevelOrder(treeRoot);
    }
}
