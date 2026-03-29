class Solution {
    public int calculate(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        char[] str = s.toCharArray();
        
        char sign = '+';
        int num = 0;

        for (int i = 0; i < str.length; i++) {
            char c = str[i];
            if (Character.isDigit(c))
                num = num * 10 + (c - '0');
            
            if (!Character.isDigit(c) && c != ' ' || i == str.length - 1) {
                if (sign == '+')
                    stack.push(num);
                else if (sign == '-')
                    stack.push(-num);
                else if (sign == '*')
                    stack.push(stack.pop() * num);
                else
                    stack.push(stack.pop() / num);
                
                sign = c;
                num = 0;
            }
        }

        int res = 0;
        for (int v : stack)
            res += v;
        
        return res;
    }
}