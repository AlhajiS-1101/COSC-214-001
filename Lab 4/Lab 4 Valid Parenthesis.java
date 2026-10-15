class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        boolean check = true;
        
        Map<Character, Character> newStack = new HashMap<>();
        newStack.put(')', '(');
        newStack.put(']', '[');
        newStack.put('}', '{');

        for (char c : s.toCharArray()) {
            if (newStack.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == newStack.get(c)) {
                    stack.pop();
                } else {
                    check = false;
                }
            } else {
                stack.push(c);
            }

        }

        if (check == false) {
            return false;
        }
        else {
            return true;
        }
    }
}
