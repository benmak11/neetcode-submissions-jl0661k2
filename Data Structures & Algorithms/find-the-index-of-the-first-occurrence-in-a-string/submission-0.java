class Solution {
    public int strStr(String haystack, String needle) {
        int k = needle.length();

        int hash = needle.hashCode();
        for (int i = 0; i < haystack.length() - k + 1; i++) {
            int h2 = haystack.substring(i, i + k).hashCode();

            if (hash == h2)
                return i;
        }

        return -1;
    }
}