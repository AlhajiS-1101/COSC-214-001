import java.util.Collections;
import java.util.PriorityQueue;

public class Problem2 {
    public static void main(String[] args) {
        // Max Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int [] prob2 = {4, 2, 7, 1};
        int thing = 0;
        
        for (int z : prob2) {
            maxHeap.add(z);
        }
        
        thing = maxHeap.peek();
        System.out.printf("Max Value: %d", thing);
        
    }
}
