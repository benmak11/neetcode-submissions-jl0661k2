class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int l = 0, prod = 1, res = 0;

        for (int r = 0; r < nums.length; r++) {
            prod *= nums[r];

            while (prod >= k && l < nums.length)
                prod /= nums[l++];
            
            res += r - l + 1;
        }
        return res;
    }
}