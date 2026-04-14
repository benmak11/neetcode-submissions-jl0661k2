class Solution {
    public int compress(char[] chars) {
        int l = 0, write = 0;

        while (l < chars.length) {
            chars[write++] = chars[l];
            int r = l + 1;

            while (r < chars.length && chars[l] == chars[r])
                r++;
            
            if (r - l > 1) {
                String count = Integer.toString(r - l);
                for (char c : count.toCharArray())
                    chars[write++] = c;
            }

            l = r;
        }

        return write;
    }
}