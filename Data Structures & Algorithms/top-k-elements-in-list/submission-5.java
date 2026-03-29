class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums)
            map.merge(n, 1, Integer::sum);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            pq.offer(e.getKey());
            if (pq.size() > k)
                pq.poll();
        }

        int[] res = new int[k];

        for (int i = 0; i < res.length; i++)
            res[i] = pq.poll();

        return res;
    }
}
