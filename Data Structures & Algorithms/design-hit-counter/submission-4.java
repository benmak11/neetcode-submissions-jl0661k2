class HitCounter {
    TreeMap<Integer, Integer> hitCounter;
    public HitCounter() {
        hitCounter = new TreeMap<>();
    }
    
    public void hit(int timestamp) {
        hitCounter.merge(timestamp, 1, Integer::sum);
    }
    
    public int getHits(int timestamp) {
        hitCounter.headMap(timestamp - 299).clear();

        return hitCounter.values().stream().mapToInt(i -> i).sum();
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */
