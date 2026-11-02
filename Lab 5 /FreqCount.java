import java.util.HashMap;

public class FreqCount {
    public static void main(String[] args) {
        HashMap <Integer, Integer> freq = new HashMap<>();
        int [] nums = {1, 2, 2, 3, 1, 1, 4};
        for ( int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0)+ 1);
        }

        System.out.println(freq);
    }
}
