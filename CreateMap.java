
import java.util.HashMap;

public class CreateMap {
    public static void main(String[] args) {
        // This creates the Hashmap "students"
        HashMap <Integer, String> students = new HashMap<>();

        // The following three lines add students to the "students" map with their ID Numbers
        students.put(1001, "Max");
        students.put(1002, "Jack");
        students.put(1003, "Maxxine");

        // The following prints out the student "Max" using his ID Number 1001
        System.out.println(students.get(1001));

        // The following replaces the student currently belonging to the ID NUmber 1002 with a new student named Greg
        students.put(1002, "Greg");

        // The following removes the student "Maxxing" from the map using her ID Number
         students.remove(1003);
    }
}