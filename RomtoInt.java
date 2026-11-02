import java.util.HashMap;

public class RomtoInt {
    public static void main(String[] args) {
        HashMap<Character, Integer> values = new HashMap<>();

        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int total = 0;

        String input = "IV";

        int length = input.length();

        for (int i = 0; i < length; i++) {
            int currentVal = values.get(input.charAt(i));

            if (i < length - 1 && currentVal < values.get(input.charAt(i + 1))) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }

        System.out.println(total);
    
    }
}
