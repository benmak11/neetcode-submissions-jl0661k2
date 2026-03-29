class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        Deque<String> dq = new ArrayDeque<>();

        String[] strs = path.split("/");

        for (String str : strs) {
            if (str.equals(".") || str.isEmpty())
                continue;
            else if (str.equals("..")) {
                if (!dq.isEmpty())
                    dq.pollLast();
            } else
                dq.offerLast(str);
        }

        sb.append("/");
        while (!dq.isEmpty()) {
            sb.append(dq.poll() + "/");
        }

        if (sb.length() > 1)
            sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}