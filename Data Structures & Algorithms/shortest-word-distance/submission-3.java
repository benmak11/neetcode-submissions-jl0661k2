class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int index1 = -1, index2 = -1, minDist = Integer.MAX_VALUE;

        for (int i = 0; i < wordsDict.length; i++) {
            if (word1.equals(wordsDict[i]))
                index1 = i;
            if (word2.equals(wordsDict[i]))
                index2 = i;
            
            if (index1 != -1 && index2 != -1)
                minDist = Math.min(minDist, Math.abs(index2 - index1));
        }

        return minDist;
    }
}
