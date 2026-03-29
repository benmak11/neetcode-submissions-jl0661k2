class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int com = target - nums[i];

            if (map.containsKey(nums[i]))
                return new int[]{map.get(nums[i]), i};
            
            map.put(com, i); // [{4, 0}, {3, 1}, {2, 2}, {}]
        }

        return new int[]{};
    }
}
