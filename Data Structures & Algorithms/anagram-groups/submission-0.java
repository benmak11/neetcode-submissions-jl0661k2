class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> seen = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for (String str : strs) {
            char[] arr = str.toCharArray();

            Arrays.sort(arr);

            String sortedStr = new String(arr);

            if (seen.containsKey(sortedStr)) {
                seen.get(sortedStr).add(str);
            } else {
                List<String> wordsList = new ArrayList<>();
                wordsList.add(str);
                seen.put(sortedStr, wordsList);
            }
        }

        for (Map.Entry<String, List<String>> entry : seen.entrySet()) {
            List<String> e = new ArrayList<>();
            for (String s : entry.getValue())
                e.add(s);
            res.add(e);
        }

        return res;
    }
}
