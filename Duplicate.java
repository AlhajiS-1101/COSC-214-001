import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        HashSet <Integer> duplicate = new HashSet<>();
        
        int [] nums = {3, 1, 4, 2, 5, 3};

        for (int num:nums) {
            if (duplicate.contains(num)) {
                System.out.println(num);
                return;
            }
            duplicate.add(num);
        }
        System.out.println("all good!");

    }
    
}
