class Solution {
    public void sortColors(int[] nums) {
        int[] counts = new int[3];

        for (int i = 0; i < nums.length; i++)
            counts[nums[i]]++;
        int i = 0;
        for (int k = 0; k < counts.length; k++) {
            for (int j = 0; j < counts[k]; j++) {
                nums[i] = k;
                i++;
            }
        }
    }
}