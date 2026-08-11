class Solution {
    public int maxProfit(int[] prices) {
        int prof = 0;
        int buy = prices[0]; //find max value on the left of the index

        for(int i = 1; i < prices.length; i++){
            int cur = prices[i];
            prof = Math.max(prof, cur - buy);
            buy = Math.min(buy, cur);
        }
        return prof;
    }
}
