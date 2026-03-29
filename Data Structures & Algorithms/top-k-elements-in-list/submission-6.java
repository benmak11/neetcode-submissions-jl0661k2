class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums)
            map.merge(n, 1, Integer::sum);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(map.get(a), map.get(b))
        );

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int key = e.getKey();
            pq.offer(key);
            if (pq.size() > k)
                pq.poll();
        }

        int[] res = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            res[i] = pq.poll();
            i++;
        }

        return res;
    }
}
