class Solution {
    public String simplifyPath(String path) {
        Deque<String> dq = new ArrayDeque<>();

        for (String s : path.split("/")) {
            if (s.equals(".") || s.isEmpty())
                continue;
            else if (s.equals("..")) {
                if (!dq.isEmpty())
                    dq.pollLast();
            } else
                dq.offer(s);
        }

        return "/" + String.join("/", dq);
    }
}