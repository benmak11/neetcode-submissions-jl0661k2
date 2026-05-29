class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> closingToOpening = Map.of(
            '}', '{',
            ']', '[',
            ')', '('
        );

        for (char c : s.toCharArray()) {
            if (closingToOpening.containsKey(c)) {
                if (!stack.isEmpty() && closingToOpening.get(c) == stack.peek())
                    stack.pop();
                else
                    return false;
            } else
                stack.push(c);
        }

        return stack.isEmpty();
    }
}
