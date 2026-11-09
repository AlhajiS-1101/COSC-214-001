import java.util.*;

class Node {
    int val;
    List<Node> children;

    Node(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }
}

public class Problem5_1_LevelOrderList {
    public static List<List<Integer>> levelOrderList(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                level.add(current.val);

                for (Node child : current.children) {
                    queue.add(child);
                }
            }
            result.add(level);
        }
        return result;
    }
}
