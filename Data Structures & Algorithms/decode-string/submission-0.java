class Solution {
    public String decodeString(String s) {
        Deque<Integer> numStack = new ArrayDeque<>();
        Deque<String> strStack = new ArrayDeque<>();

        int k = 0;
        String curr = "";

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c))
                k = k * 10 + (Character.getNumericValue(c));
            
            if (Character.isAlphabetic(c))
                curr += c;
            
            if (c == '[') {
                numStack.push(k);
                strStack.push(curr);
                k = 0;
                curr = "";
            }

            if (c == ']') {
                String prev = strStack.pop();
                int r = numStack.pop();

                curr = prev + curr.repeat(r);
            }
        }

        return curr;
    }
}