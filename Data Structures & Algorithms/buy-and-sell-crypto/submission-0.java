class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int maxProfit = 0;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int p = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, p);
            } else
                l = r;
            r++;
        }
        return maxProfit;
    }
}
