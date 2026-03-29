class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> reference = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            reference.computeIfAbsent(sorted, s -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(reference.values());
    }
}
