class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int n : nums)
            count.merge(n, 1, Integer::sum);
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            pq.offer(new int[]{e.getValue(), e.getKey()});
            if (pq.size() > k)
                pq.poll();
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++)
            res[i] = pq.poll()[1];

        return res;
    }
}
