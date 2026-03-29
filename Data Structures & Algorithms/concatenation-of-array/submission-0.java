class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int index = n;
        int[] res = new int[n * 2];
        for (int i = 0; i < n; i++) {
            res[i] = nums[i];
            res[index] = nums[i];
            index++;
        }
        return res;
    }
}