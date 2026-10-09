import java.util.ArrayDeque;
import java.util.Deque;

public class AlhajiQueue {
    
    public static void main(String[] args) {
        Deque<String> students = new ArrayDeque<>();

        students.add("Bob");
        students.add("Jeff");
        students.add("Max");
        students.add("Jack");
        students.add("Minty");

        int n = students.size();

        while(!students.isEmpty()) {
            System.out.println(students.getFirst());
            students.removeFirst();
        }        

    
    }

}
