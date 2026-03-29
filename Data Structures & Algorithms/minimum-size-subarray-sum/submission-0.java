class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE, l = 0, curSum = 0;

        for (int r = 0; r < nums.length; r++) {
            curSum += nums[r];
            while (curSum >= target) {
                res = Math.min(res, r - l + 1);
                curSum -= nums[l];
                l++;
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}