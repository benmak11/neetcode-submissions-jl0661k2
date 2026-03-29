class Solution {
    public void reverseWords(char[] s) {
        reverse(s, 0, s.length - 1);

        reverseEachWord(s);
    }

    public void reverse(char[] s, int left, int right) {
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }

    public void reverseEachWord(char[] s) {
        int n = s.length, start = 0, end = 0;

        while (start < n) {
            while (end < n && s[end] != ' ')
                ++end;
            
            reverse(s, start, end - 1);

            start = end + 1;
            ++end;
        }
    }
}
