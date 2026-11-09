import java.util.ArrayList;
import java.util.List;

class Node {
    int val;
    List<Node> children;
    Node (int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }
}

public class NodeCount {
    
    int countNodes(Node root) {
        if (root == null) return 0; 
        
        int count = 1; 
        
        for (Node child : root.children) {
            count += countNodes(child); 
        }
        
        return count; 
    }

    // This is the missing entry point that Java requires to run your program
    public static void main(String[] args) {
        // 1. Create individual nodes
        Node root = new Node(1);
        Node child1 = new Node(2);
        Node child2 = new Node(3);
        Node child3 = new Node(4);
        
        // 2. Build the tree structure (root has 3 children)
        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);
        
        // child1 gets its own child
        child1.children.add(new Node(5));

        // 3. Create an instance of NodeCount to run your method
        NodeCount calculator = new NodeCount();
        int totalNodes = calculator.countNodes(root);
        
        // 4. Print the result (should be 5)
        System.out.println("Total nodes in the tree: " + totalNodes);
    }
}
