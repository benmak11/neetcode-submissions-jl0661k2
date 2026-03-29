class FirstUnique {
    LinkedHashSet<Integer> unique;
    Map<Integer, Boolean> seen;
    public FirstUnique(int[] nums) {
        unique = new LinkedHashSet<>();
        seen = new HashMap<>();

        for (int n : nums) {
            if (!seen.containsKey(n)) {
                seen.put(n, false);
                unique.add(n);
            } else {
                seen.put(n, true);
                unique.remove(n);
            }
        }
    }
    
    public int showFirstUnique() {
        return unique.size() == 0 ? -1 : unique.iterator().next();
    }
    
    public void add(int value) {
        if (!seen.containsKey(value)) {
            seen.put(value, false);
            unique.add(value);
        } else {
            seen.put(value, true);
            unique.remove(value);
        }
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
