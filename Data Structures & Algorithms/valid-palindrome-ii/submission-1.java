class Solution {
    public boolean validPalindrome(String s) {
        return isValid(s, 0, s.length() - 1, 1);
    }

    private boolean isValid(String s, int l, int r, int k) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                if (k > 0) 
                    return isValid(s, l + 1, r, k - 1) || isValid(s, l, r - 1, k - 1);
                else
                    return false;
            }
            l++;
            r--;
        }
        return true;
    }
}