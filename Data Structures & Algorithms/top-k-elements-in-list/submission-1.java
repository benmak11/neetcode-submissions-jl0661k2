class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();

        Arrays.sort(nums);

        for (int num : nums)
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        for (int i = 0; i < k; i++) {
            result.add(list.get(i).getKey());
        }

        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++)
            res[i] = result.get(i);
        
        return res;
    }
}
