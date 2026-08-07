class Solution {
    public String decodeString(String s) {
        Deque<Integer> numStack = new ArrayDeque<>();
        Deque<String> letters = new ArrayDeque<>();

        int k = 0;
        String curr = "";

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c))
                k = k * 10 + (c - '0');
            
            if (Character.isLetter(c))
                curr += c;

            if (c == '[') {
                numStack.push(k);
                letters.push(curr);
                k = 0;
                curr = "";
            }

            if (c == ']') {
                String prev = letters.pop();
                int repeat = numStack.pop();

                curr = prev + curr.repeat(repeat);
            }
        }

        return curr;
    }
}