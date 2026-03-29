class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> cnt = new HashMap<>();

        for (int n : nums)
            cnt.put(n, cnt.getOrDefault(n, 0) + 1);

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(cnt.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        for (int i = 0; i < k; i++)
            res.add(list.get(i).getKey());
        
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++)
            result[i] = res.get(i);
        
        return result;
    }
}
