import java.util.*;

public class WarmUp {
    static class Node {
        int val;
        List<Node> children;
        Node(int val) {
            this.val = val;
            this.children = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        System.out.println("Node created with val: " + root.val);
    }
}
