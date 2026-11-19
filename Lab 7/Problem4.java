import java.util.PriorityQueue;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] prob4 = {4, 2, 5, 9, 10};
        PriorityQueue<Integer> maxK = new PriorityQueue<>();
        
        System.out.println("Enter your k: ");
        int newK = scanner.nextInt();
        
        if (newK > prob4.length)
            System.out.println("Error, Too Big");
        else {
            for (int b : prob4) {
                maxK.add(b);
            }
            
            int subKA = prob4.length - newK;
            while (subKA != 0) {
                maxK.poll();
                subKA--;
            }
            System.out.println("Final: " + maxK);
        }
        
    }
}
