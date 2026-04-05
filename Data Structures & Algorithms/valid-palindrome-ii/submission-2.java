class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        return isValid(s, l, r, 1);
    }

    public boolean isValid(String s, int l, int r, int k) {

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                if (k > 0)
                    return isValid(s, l + 1, r, k - 1) || isValid(s, l, r - 1, k - 1);
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}