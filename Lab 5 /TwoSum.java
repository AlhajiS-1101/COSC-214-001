import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        HashMap <Integer, Integer> twoNums = new HashMap<>();

        int [] nums = {2, 7, 11, 12};
        int target = 9;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int complement = target - n;
            if (twoNums.containsKey(complement)) {
                int [] hold = {twoNums.get(complement), i};
                System.out.println(java.util.Arrays.toString(hold));
                return;
            }
            twoNums.put(n, i);
        }
        System.out.println("None Found");
    }
}
