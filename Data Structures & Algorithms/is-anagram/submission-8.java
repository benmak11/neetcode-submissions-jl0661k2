class Solution {
    public boolean isAnagram(String s, String t) {
        char[] cS = s.toCharArray();
        char[] tS = t.toCharArray();

        if (cS.length != tS.length)
            return false;

        Arrays.sort(cS);
        Arrays.sort(tS);

        for (int i = 0; i < tS.length; i++) {
            if (cS[i] != tS[i])
                return false;
        }

        return true;
    }
}
