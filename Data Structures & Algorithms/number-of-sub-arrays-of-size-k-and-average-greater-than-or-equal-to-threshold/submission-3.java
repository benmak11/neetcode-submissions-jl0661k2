class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int res = 0, curr = 0;
        for (int i = 0; i < k; i++)
            curr += arr[i];
        
        int target = threshold * k;
        if (curr >= target)
            res++;

        for (int r = k; r < arr.length; r++) {
            curr += arr[r];
            curr -= arr[r - k];

            if (curr >= target)
                res++;
        }

        return res;
    }
}