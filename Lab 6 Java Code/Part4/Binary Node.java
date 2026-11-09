class BNode {
    int val;
    BNode left;
    BNode right;

    BNode(int val) {
        this.val = val;
    }
}

public class Problem4_1_BinaryNode {
    public static BNode createNode(int value) {
        return new BNode(value);
    }
}
