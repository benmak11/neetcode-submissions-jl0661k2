class Solution {
    public int compress(char[] chars) {
        int i = 0, write = 0;

        while (i < chars.length) {
            chars[write++] = chars[i];
            int j = i + 1;
            
            while (j < chars.length && chars[i] == chars[j])
                j++;
            
            if (j - i > 1) {
                String count = String.valueOf(j - i);
                for (char c : count.toCharArray())
                    chars[write++] = c;
            }
            
            i = j;
        }

        return write;
    }
}