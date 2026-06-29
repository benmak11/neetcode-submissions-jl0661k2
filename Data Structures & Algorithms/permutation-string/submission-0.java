class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        Map<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            count.merge(s1.charAt(i), 1, Integer::sum);
            count.merge(s2.charAt(i), -1, Integer::sum);
        }

        if (allZero(count))
            return true;
        
        for (int i = s1.length(); i < s2.length(); i++) {
            count.merge(s2.charAt(i), -1, Integer::sum);
            count.merge(s2.charAt(i - s1.length()), 1, Integer::sum);
            if (allZero(count))
                return true;
        }
        return false;
    }

    private boolean allZero(Map<Character, Integer> count) {
        for (int val : count.values()) {
            if (val != 0)
                return false;
        }
        return true;
    }
}
