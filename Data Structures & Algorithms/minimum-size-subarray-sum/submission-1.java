class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE, curr = 0, l = 0;

        for (int r = 0; r < nums.length; r++) {
            curr += nums[r];

            while (curr >= target) {
                res = Math.min(res, r - l + 1);
                curr -= nums[l++];
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}