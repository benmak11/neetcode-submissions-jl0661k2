class WordDistance {
    Map<String, List<Integer>> map = new HashMap<>();
    public WordDistance(String[] wordsDict) {
        for (int i = 0; i < wordsDict.length; i++)
            this.map.computeIfAbsent(wordsDict[i], k -> new ArrayList<>()).add(i);
    }
    
    public int shortest(String word1, String word2) {
        List<Integer> l1 = map.get(word1);
        List<Integer> l2 = map.get(word2);

        int l = 0, r = 0, min = Integer.MAX_VALUE;

        while (l <= l1.size() - 1 && r <= l2.size() - 1) {
            min = Math.min(min, Math.abs(l1.get(l) - l2.get(r)));

            if (l1.get(l) < l2.get(r))
                l++;
            else
                r++;
        }

        return min;
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(wordsDict);
 * int param_1 = obj.shortest(word1,word2);
 */
