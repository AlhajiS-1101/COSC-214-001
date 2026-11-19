import java.util.PriorityQueue;

public class Problem1 {
    public static void main(String[] args) {
        // Min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    
        int [] prob1 = {4, 2, 7, 1};
        
        for (int y : prob1) {
            minHeap.add(y);
        }

        System.out.println("Final: " + minHeap);
        
    }
}
