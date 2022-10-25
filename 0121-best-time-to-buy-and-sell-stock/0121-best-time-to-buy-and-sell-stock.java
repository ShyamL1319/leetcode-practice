class Solution {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        int n = prices.length;
        for (int buy = 0; buy < n; buy++) {
            minPrice = Math.min(minPrice, prices[buy]);
            maxProfit = Math.max(prices[buy] - minPrice, maxProfit);
        }
        return maxProfit;
    }
}
