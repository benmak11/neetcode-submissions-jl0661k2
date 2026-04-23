class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1, n = nums.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = prod;
            prod *= nums[i];
        }

        prod = 1;

        for (int j = n - 1; j >= 0; j--) {
            res[j] *= prod;
            prod *= nums[j];
        }

        return res;
    }
}  
