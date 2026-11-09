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
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    private void preorderHelper(Node node, List<Integer> result) {
        if (node == null) return;

        result.add(node.val);
        for (Node child : node.children) {
            preorderHelper(child, result);
        }
    }
}
