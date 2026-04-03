class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeros = 0, res = 0, l = 0;

        for (int r = 0; r < nums.length; r++) {

            if (nums[r] == 0)
                zeros++;
            
            while (zeros > k) {
                if (nums[l] == 0)
                    zeros--;
                l++;
            }

            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}