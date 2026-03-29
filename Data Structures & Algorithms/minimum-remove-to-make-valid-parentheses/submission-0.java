class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];

            if (c == '(')
                stack.push(i);
            else if (c == ')') {
                if (!stack.isEmpty())
                    stack.pop();
                else
                    arr[i] = '\0';
            }
        }

        while (!stack.isEmpty())
            arr[stack.pop()] = '\0';


        return new String(arr).replace("\0", "");
    }
}