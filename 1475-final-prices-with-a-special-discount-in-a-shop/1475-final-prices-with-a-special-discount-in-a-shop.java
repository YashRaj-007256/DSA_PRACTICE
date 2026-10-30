class Solution {
    public int[] finalPrices(int[] prices) {
        int[] r = new int[prices.length];
        for(int i = 0; i < prices.length; i++) {
            int newPrice = prices[i];
            for(int j = i+1; j < prices.length; j++) {
                if(prices[j] <= prices[i]) {
                    newPrice -= prices[j];
                    break;
                }
            }
            r[i] = newPrice;
        }
        return r;
    }
}