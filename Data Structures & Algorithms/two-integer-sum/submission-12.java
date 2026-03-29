class Solution {
    /**
    Will have a HashMap to store the complement val so its [{com, index}]

    if our map containsKey nums[i]
        that means we have found our two indices so return nums[i], plus curr index
    
    otherwise add to hashmap com and index
    Outside the loop we return the new int[]{} cause its guranteed we will find our indices i and j
    Time: O(n) and Space is O(n) cause of hashmap storage
    */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int com = target - nums[i];

            if (map.containsKey(nums[i]))
                return new int[]{map.get(nums[i]), i};
            
            map.put(com, i);
        }

        return new int[]{};
    }
}
