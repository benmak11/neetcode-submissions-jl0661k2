class Solution {
    public boolean validPalindrome(String s) {
        return isValidPalindrome(s, 0, s.length() - 1, 1);
    }

    private boolean isValidPalindrome(String s, int l, int r, int delete) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                if (delete > 0)
                    return isValidPalindrome(s, l + 1, r, delete - 1) || isValidPalindrome(s, l, r - 1, delete - 1);
                else
                    return false;
            }
            l++;
            r--;
        }
        return true;
    }
}