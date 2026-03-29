class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> cnt = new HashMap<>();

        for (int i : nums)
            cnt.put(i, cnt.getOrDefault(i, 0) + 1);

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : cnt.entrySet())
            arr.add(new int[] {entry.getValue(), entry.getKey()});

        arr.sort((a, b) -> b[0] - a[0]);

        for (int i = 0; i < k; i++)
            res[i] = arr.get(i)[1];
        
        return res;
    }
}
