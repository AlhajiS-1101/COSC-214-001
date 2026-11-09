import java.util.*;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
        children = new ArrayList<>();
    }

    public Node(int val) {
        this.val = val;
        children = new ArrayList<>();
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }
}

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }

    private void postorderHelper(Node node, List<Integer> result) {
        if (node == null) return;

        for (Node child : node.children) {
            postorderHelper(child, result);
        }
        result.add(node.val);
    }
}
