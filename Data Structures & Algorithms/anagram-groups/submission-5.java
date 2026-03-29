class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ref = new HashMap<>();

        for (String s : strs) {
            int[] cnt = new int[26];

            for (char c : s.toCharArray())
                cnt[c - 'a']++;
            
            String str = Arrays.toString(cnt);
            ref.computeIfAbsent(str, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(ref.values());
    }
}
