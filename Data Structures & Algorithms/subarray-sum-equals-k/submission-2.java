class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int res = 0, curSum = 0;

        for (int n : nums) {
            curSum += n;
            int diff = curSum - k;
            res += map.getOrDefault(diff, 0);
            map.put(curSum, map.getOrDefault(curSum, 0) + 1);
        }
        return res;
    }
}