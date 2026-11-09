import java.util.ArrayList;
import java.util.List;

class Node {
    public int data;
    public List<Node> children;

    public Node(int val) {
        data = val;
        this.children = new ArrayList<>();
    }
}

public class CountLeaf {

    public static int countLeaves(Node root) {
        if (root == null) {
            return 0;
        }
        
        if (root.children == null || root.children.isEmpty()) {
            return 1;
        }
        
        int count = 0;
        for (Node child : root.children) {
            count += countLeaves(child);
        }
        
        return count;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        Node child2 = new Node(2);
        Node child3 = new Node(3);
        
        root.children.add(child2);
        root.children.add(child3);
        
        child2.children.add(new Node(4));
        child2.children.add(new Node(5));

        int totalLeaves = countLeaves(root);
        
        System.out.println("Total leaf nodes: " + totalLeaves); 
    }
}
