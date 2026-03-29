class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l = 0, res = 0;
        for (int r = k - 1; r < arr.length; r++) {
            List<Integer> nums = new ArrayList<>();
            for (int i = l; i <= r; i++)
                nums.add(arr[i]);
            
            int sum = nums.stream().mapToInt(Integer::intValue).sum();

            if (sum / k >= threshold)
                res++;
            
            l++;
        }

        return res;
    }
}