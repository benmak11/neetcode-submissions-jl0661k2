class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1)
            return 0;
        
        int prod = 1, res = 0, l = 0, n = nums.length;

        for (int r = 0; r < n; r++) {
            prod *= nums[r];

            while (prod >= k && l < n)
                prod /= nums[l++];
            
            res += (r - l + 1);
        }

        return res;
    }
}