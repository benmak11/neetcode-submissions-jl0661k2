class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int right = -1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = right;
            right = Math.max(right, arr[i]);
        }

        return ans;
    }
}