class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l = 0, res = 0;
        for (int r = k - 1; r < arr.length; r++) {
            int curr = 0;
            for (int i = l; i <= r; i++)
                curr += arr[i];
            
            if (curr >= threshold * k)
                res++;
            
            l++;
        }

        return res;
    }
}