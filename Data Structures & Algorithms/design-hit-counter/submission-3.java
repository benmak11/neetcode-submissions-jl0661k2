class HitCounter {
    Deque<Integer> hitCounter;
    public HitCounter() {
        this.hitCounter = new ArrayDeque<>();
    }
    
    public void hit(int timestamp) {
        hitCounter.offer(timestamp);
    }
    
    public int getHits(int timestamp) {
        while (!hitCounter.isEmpty() && timestamp - hitCounter.peekFirst() >= 300)
            hitCounter.pollFirst();

        return hitCounter.size();
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */
