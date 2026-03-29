class Solution {
    /**
    We use a stack to keep track of indices of the opening bracket
    when we encounter a closed paranthes we remove from stack, IFF its empty and stack.peek is '('
    otherwise mark that index for deletion with '\0' -> null marker, safer than putting a random character
    while the stack is not empty() mark opening bracets to be deleted with the same null marker
    return rebuilt str with replacements for null marker

    Time: O(n), space O(n)
    */
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '(')
                stack.push(i);
            else if (c == ')') {
                if (!stack.isEmpty())
                    stack.pop();
                else
                    chars[i] = '\0';
            }
        }

        while (!stack.isEmpty())
            chars[stack.pop()] = '\0';

        return new String(chars).replace("\0", "");
    }
}