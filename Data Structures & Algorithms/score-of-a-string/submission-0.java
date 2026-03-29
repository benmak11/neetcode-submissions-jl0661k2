class Solution {
    public int scoreOfString(String s) {
        int res = 0;

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length -1; i++) {
            int x = (int) chars[i + 1];
            int y = (int) chars[i];

            res += Math.abs(x - y);
        }

        return res;
    }
}