import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] prob3 = {4, 2, 5, 9, 10};
        
        PriorityQueue<Integer> findK = new PriorityQueue<>(Collections.reverseOrder());
        
        System.out.println("\nEnter your k: ");
        int k = scanner.nextInt();
        
        if (k > prob3.length)
            System.out.println("Error, Too Big");
        else {
            for (int a : prob3) {
                findK.add(a);
            }
            
            int subK = prob3.length - k;
            while (subK != 0) {
                findK.poll();
                subK--;
            }
            System.out.println("Final: " + findK);
        }
        
    }
}
